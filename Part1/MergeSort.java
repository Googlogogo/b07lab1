package lab5.Lab5Part1;

public class MergeSort {
    public static void sort(double [] A, int left, int right)
    {
        if (left < right) {
            int middle = left + (right-left)/2;
 
            sort(A, left, middle);
            sort(A, middle + 1, right);
 
            merge(A, left, middle, right);
        }
    }
    
    private static void merge(double [] A, int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;
 
        double [] L = new double[n1];
        double [] R = new double[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = A[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[middle + 1 + j];
 
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
}