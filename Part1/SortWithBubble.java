package lab5.Lab5Part1;

import java.util.List;

public class SortWithBubble implements SortingService{
    @Override
    public List<Double> sort(List<Double> L) {
        double[] numbers = new double[L.size()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = L.get(i);
        }
        BubbleSort.sortArray(numbers);
        for (int j = 0; j < numbers.length; j++) {
            L.set(j, numbers[j]);
        }
        return L;
    }
}
