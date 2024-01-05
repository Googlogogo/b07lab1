package lab5.Lab5Part1;

public class BubbleSort{
    public static void sortArray(double [] A)
    {
        int n = A.length;
        for (int i = 0; i < n-1; i++) {
        	for (int j = 0; j < n-i-1; j++) {
        		if (A[j] > A[j+1]) {
        			double temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
        		}
        	}
        }
    }
}