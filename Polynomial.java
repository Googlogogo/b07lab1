package b07lab1;

import java.io.*;

public class Polynomial {
    double[] coefficients = new double[100];
    int[] exponents = new int[100];
    int index;
    public Polynomial() {
        for (index = 0; index < coefficients.length; index++) {
            coefficients[index] = 0.0;
            exponents[index] = index;
        }
    }

    public Polynomial(double[] c, int[] e) {
        for (index = 0; index < c.length; index++) {
            coefficients[index] = c[index];
            exponents[index] = e[index];
        }
    }

    public Polynomial(File f) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String line = reader.readLine();
        String[] parts = line.split("(?=-)|(\\+)");
        for (String sub : parts) {
            if (sub.contains("x")) {
                if (sub.contains("-")) {
                    exponents[Integer.parseInt(sub.substring(3, 4))] = Integer.parseInt(sub.substring(3, 4));
                    coefficients[Integer.parseInt(sub.substring(3, 4))] = Double.parseDouble(sub.substring(0, 2));
                } else {
                    exponents[Integer.parseInt(sub.substring(2, 3))] = Integer.parseInt(sub.substring(2, 3));
                    coefficients[Integer.parseInt(sub.substring(2, 3))] = Double.parseDouble(sub.substring(0, 1));
                }
            } else {
                exponents[0] = 0;
                coefficients[0] = Double.parseDouble(sub);
            }
        }
        reader.close();
    }
    public Polynomial multiply(Polynomial p) {
        int i, j, k;
        Polynomial product = new Polynomial();
        for (i = 0; i < this.coefficients.length; i++) {
            for (j = 0; j < p.coefficients.length; j++) {
                k = this.exponents[i] + p.exponents[j];
                product.coefficients[k] += this.coefficients[i] * p.coefficients[j];
            }
        }
        for (int idx = 0; idx < product.coefficients.length; idx++) {
            if (product.coefficients[idx] == 0.0) {
                product.exponents[idx] = 0;
            }
        }
        return product;
    }

    public void saveToFile(String s) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(s));
        int idx = 1;
        boolean flag = true;
        if (this.coefficients[0] != 0.0) writer.write(String.valueOf((int)this.coefficients[0]));
        while ((idx < this.coefficients.length)) {
            if (this.coefficients[idx] == 0.0) {
                idx++;
                continue;
            }
            else if (this.coefficients[idx] < 0) {writer.write(String.valueOf((int)this.coefficients[idx]));}
            else {
                for (int i = 0; i < idx; i++) {
                    if (this.coefficients[i] != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {writer.write(String.valueOf((int)this.coefficients[idx]));}
                else {writer.write("+" + (int)this.coefficients[idx]);}
            }
            writer.write("x" + this.exponents[idx]);
            idx++;
        }
        writer.close();
    }

    public Polynomial add(Polynomial p) {
        Polynomial new_polynomial = new Polynomial();
        for (index = 0; index < coefficients.length; index++) {
            new_polynomial.coefficients[index] = coefficients[index] + p.coefficients[index];
        }
        return new_polynomial;
    }

    public double evaluate(double x) {
        double answer = 0.0;
        for (index = 0; index < coefficients.length; index++) {
            answer += coefficients[index] * Math.pow(x, index);
        }
        return answer;
    }

    public boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }
}