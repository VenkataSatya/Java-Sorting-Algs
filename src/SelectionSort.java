/**
 * Created by Venkata on 8/14/2015.
 *
 * stores the lowest index and swapss
 *
 * i to n
 * j=i+1 to n
 *
 * check for smaller values store the index position till the loop has ended
 * at last swap
 *
 * if it does not find the smalles even then swaps takes place withthe same value but no use
 */
public class SelectionSort {

    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static void main(String a[]){

        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}

