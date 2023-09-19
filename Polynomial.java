package b07lab1;

public class Polynomial {
    double[] coefficients = new double[100];
    int index; // counter variable
    public Polynomial() {
        for (index = 0; index < coefficients.length; index++) {
            coefficients[index] = 0.0;
        }
    }

    public Polynomial(double[] c) {
        for (index = 0; index < c.length; index++) {
            coefficients[index] = c[index];
        }
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
