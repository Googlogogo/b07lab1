package lab3;
import java.util.List;

/**
 * The abstract SpecialNumber class serves as a base class for representing special numbers.
 * Subclasses (RationalNumber and ComplexNumber classes) should implement the abstract methods
 * 'add' and 'divideByInt' to define specific operations on special numbers.
 */
public abstract class SpecialNumber {
    public abstract SpecialNumber add(SpecialNumber specialNumber) throws Lab3Exception;
    public abstract SpecialNumber divideByInt(int x) throws Lab3Exception;

    /**
     * This method computes the average of a list of SpecialNumber objects
     * @param list the list of SpecialNumber objects for which to compute the average
     * @return the average of the SpecialNumber objects in the list
     * @throws Lab3Exception if the parameter list is empty
     */
    public static SpecialNumber computeAverage(List<SpecialNumber> list) throws Lab3Exception {
        if (list == null) throw new Lab3Exception("List cannot be empty");
        SpecialNumber sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum = sum.add(list.get(i));
        }
        return sum.divideByInt(list.size());
    }
}
