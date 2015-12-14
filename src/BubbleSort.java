/**
 * Created by Venkata on 8/14/2015.
 */
public class BubbleSort {

    // logic to sort the elements
    /** The below code is more eazy version
     *
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1])          // 0,1 : 1,2 : 2,3 : 3,4
    {                                       // 0,1 : 1,2 : 2,3
        swap       = array[d];              // 0,1 : 1,2
        array[d]   = array[d+1];            // 0,1                  largest element will be popped to last element
        array[d+1] = swap;
    }
    }
    }
     **/




    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);

    }
}
/*- See more at: http://www.java2novice.com/java-sorting-algorithms/bubble-sort/#sthash.Ipiqhiqm.dpuf*/