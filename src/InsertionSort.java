/**
 * Created by Venkata on 8/14/2015.
 */
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int A[] = new int[10];
        populateArray(A);
        System.out.println("Before Sorting: ");
        printArray(A);
        // sort the array
        insertionSort(A);
        System.out.println("\nAfter Sorting: ");
        printArray(A);
    }

    /**
     * This method will sort the integer array using insertion sort algorithm
     * i an j starts at same point. as higher the i goes, j will internally loop untill the point where j is 0 or until the element is inserted
     * at right location.if element is smallest it will be popped till the first. x,y,z,k,l  k and l are compared
     * if l is smaller j-1 is moved to j ie, k is moved to l so the array becomes x,y,z,k,k  and j-- then again checks l with z ..similarly
     * at the end compared element location is found and it pushes to that location.
     *
     * @param arr
     */
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;           // at this point valueToSort has only samllet in the iteration goes to place where exactly needs to be inserted


        }
    }

    public static void printArray(int[] B) {
        System.out.println(Arrays.toString(B));
    }

    public static void populateArray(int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }
    }
}
