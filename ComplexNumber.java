package lab3;
import java.util.Objects;

/**
 * The ComplexNumber class represents a complex number with real and imaginary parts.
 * It extends the abstract class SpecialNumber and implements the interface Comparable.
 */
public class ComplexNumber extends SpecialNumber implements Comparable<ComplexNumber> {
    double real;
    double imaginary;

    /**
     * This constructor constructs a ComplexNumber object with the specified real and imaginary parts
     * @param real the integer referring to the real part of this ComplexNumber
     * @param imaginary the integer referring to the imaginary part of this ComplexNumber
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * This method adds two ComplexNumber objects
     * @param specialNumber the rational number to be added
     * @return the sum of adding this RationalNumber to specialNumber
     * @throws Lab3Exception if the given parameter specialNumber is not an instance of RationalNumber
     */
    @Override
    public SpecialNumber add(SpecialNumber specialNumber) throws Lab3Exception {
        if (!(specialNumber instanceof ComplexNumber)) throw new Lab3Exception("Cannot add an incompatible type");
        return new ComplexNumber(this.real + ((ComplexNumber) specialNumber).real,
                this.imaginary + ((ComplexNumber) specialNumber).imaginary);
//        ComplexNumber sum = new ComplexNumber(0, 0);
//        sum.real = this.real + ((ComplexNumber) specialNumber).real;
//        sum.imaginary = this.imaginary + ((ComplexNumber) specialNumber).imaginary;
//        return sum;
    }

    /**
     * This method divides a ComplexNumber object by an integer
     * @param x the integer to be divided by
     * @return the quotient of dividing this ComplexNumber by x
     * @throws Lab3Exception if the given parameter x is 0
     */
    @Override
    public ComplexNumber divideByInt(int x) throws Lab3Exception {
        if (x == 0) throw new Lab3Exception("Cannot divide by zero");
        return new ComplexNumber(this.real / x, this.imaginary / x);
//        ComplexNumber quotient = new ComplexNumber(0, 0);
//        quotient.real = this.real / x;
//        quotient.imaginary = this.imaginary / x;
//        return quotient;
    }

    /**
     * This method determines the equality of two ComplexNumber objects
     * @param obj the object for which this ComplexNumber is comparing with
     * @return true if this ComplexNumber is equal to obj and false otherwise, including the case when
     * obj is not an instance of ComplexNumber
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ComplexNumber complexNumber)) return false;
        return ((this.real == complexNumber.real) && (this.imaginary == complexNumber.imaginary));
    }

    /**
     * This method returns the hashcode of a ComplexNumber object
     * @return the hashcode integer referring to the memory address of this ComplexNumber
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.real, this.imaginary);
    }

    /**
     * This method compares two ComplexNumber objects
     * @param c the complex number to be compared
     * @return -1 if c is less than this ComplexNumber, 0 if they are equal, and 1 otherwise
     */
    @Override
    public int compareTo(ComplexNumber c) {
        if (Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2)) ==
                Math.sqrt(Math.pow(c.real, 2) + Math.pow(c.imaginary, 2))) return 0;
        else if (Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2)) <
                Math.sqrt(Math.pow(c.real, 2) + Math.pow(c.imaginary, 2))) return -1;
        return 1;
    }
}
