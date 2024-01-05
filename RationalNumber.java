package lab3;
import java.util.Objects;

/**
 * The RationalNumber class represents a rational number in fraction given a numerator and a denominator.
 * It extends the abstract class SpecialNumber and implements the interface Comparable.
 */
public class RationalNumber extends SpecialNumber implements Comparable<RationalNumber> {
    int numerator;
    int denominator;

    /**
     * This constructor constructs a RationalNumber object with the specified numerator and denominator
     * @param numerator the integer referring to the numerator of this RationalNumber
     * @param denominator the integer referring to the denominator of this RationalNumber, which must be non-zero
     * @throws Lab3Exception if the given parameter denominator is 0
     */
    public RationalNumber(int numerator, int denominator) throws Lab3Exception {
        if (denominator == 0) throw new Lab3Exception("Denominator cannot be zero");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * This method adds two RationalNumber objects
     * @param specialNumber the rational number to be added
     * @return the sum of adding this RationalNumber to specialNumber
     * @throws Lab3Exception if the given parameter specialNumber is not an instance of RationalNumber
     */
    @Override
    public RationalNumber add(SpecialNumber specialNumber) throws Lab3Exception {
        if (!(specialNumber instanceof RationalNumber)) throw new Lab3Exception("Cannot add an incompatible type");
        return new RationalNumber(this.numerator * ((RationalNumber) specialNumber).denominator +
                this.denominator * ((RationalNumber) specialNumber).numerator,
                this.denominator * ((RationalNumber) specialNumber).denominator);
//        RationalNumber sum = new RationalNumber(0, 1);
//        sum.denominator = this.denominator * ((RationalNumber) specialNumber).denominator;
//        sum.numerator = this.numerator * ((RationalNumber) specialNumber).denominator + this.denominator *
//                ((RationalNumber) specialNumber).numerator;
//        return sum;
    }

    /**
     * This method divides a RationalNumber object by an integer
     * @param x the integer to be divided by
     * @return the quotient of dividing this RationalNumber by x
     * @throws Lab3Exception if the given parameter x is 0
     */
    @Override
    public RationalNumber divideByInt(int x) throws Lab3Exception {
        if (x == 0) throw new Lab3Exception("Cannot divide by zero");
        return new RationalNumber(this.numerator, this.denominator * x);
//        RationalNumber quotient = new RationalNumber(this.numerator, 1);
//        quotient.denominator = this.denominator * x;
//        return quotient;
    }

    /**
     * This method determines the equality of two RationalNumber objects
     * @param obj the object for which this RationalNumber is comparing with
     * @return true if this RationalNumber is equal to obj and false otherwise, including the case when
     * obj is not an instance of RationalNumber
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof RationalNumber rationalNumber)) return false;
        return (this.numerator / this.denominator) == (rationalNumber.numerator / rationalNumber.denominator);
    }

    /**
     * This method returns the hashcode of a RationalNumber object
     * @return the hashcode integer referring to the memory address of this RationalNumber
     */
    @Override
    public int hashCode() {
        return Objects.hash((double)(this.numerator / this.denominator));
    }

    /**
     * This method compares two RationalNumber objects
     * @param r the rational number to be compared
     * @return -1 if r is less than this RationalNumber, 0 if they are equal, and 1 otherwise
     */
    @Override
    public int compareTo(RationalNumber r) {
        if ((this.numerator / this.denominator) == (r.numerator / r.denominator)) return 0;
        else if ((this.numerator / this.denominator) < (r.numerator / r.denominator)) return -1;
        return 1;
    }
}
