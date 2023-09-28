package b07lab1;

import java.io.*;

public class Driver {
    public static void main(String [] args) throws Exception {
        Polynomial p = new Polynomial();
        System.out.println(p.evaluate(3));

        double[] c1 = {6.0, 0.0, 0.0, 5.0};
        int[] e1 = {0, 1, 2, 3};
        double[] c2 = {0.0, -2.0, 0.0, 0.0, -9.0};
        int[] e2 = {0, 1, 2, 3, 4, 5};
        Polynomial p1 = new Polynomial(c1, e1);
        Polynomial p2 = new Polynomial(c2, e2);
        Polynomial sum = p1.add(p2);
        System.out.println("s(0.1) = " + sum.evaluate(0.1));

        Polynomial product = p1.multiply(p2);
        System.out.println("product(0.1) = " + product.evaluate(0.1));

        if(sum.hasRoot(1)) System.out.println("1 is a root of s");
        else System.out.println("1 is not a root of s");

        File file = new File("/Users/gogo/b07lab1/text.txt");
        Polynomial new_polynomial = new Polynomial(file);
        new_polynomial.saveToFile("/Users/gogo/b07lab1/text.txt");
    }
}