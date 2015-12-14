/**
 * Created by Venkata on 8/16/2015.
 *
 * A heap is a binary tree (in which each node contains a Comparable key value), with two special properties:

 The ORDER property:

 For every node n, the value in n is greater than or equal to the values in its children (and thus is also greater than or equal to all of the values in its subtrees).
 The SHAPE property:

 All leaves are either at depth d or d-1 (for some value d).
 All of the leaves at depth d-1 are to the right of the leaves at depth d.
 (a) There is at most 1 node with just 1 child. (b) That child is the left child of its parent, and (c) it is the rightmost leaf at depth d.
 *
 *
 */

/*

 This is a way to implement heapsor using priority queque on objects, simple and eazy
import java.util.PriorityQueue;
public static <E extends Comparable<? super E>> void heapsort(E[] array) {

    // Java's PriorityQueue class functions as a min heap
    PriorityQueue<E> heap = new PriorityQueue<E>(array.length);

    // Add each array element to the heap
    for (E e : array)
        heap.add(e);

    // Elements come off the heap in ascending order
    for (int i=0; i<array.length; i++)
        array[i] = heap.remove();

}
*/

import java.util.*;

public class HeapSort {

   private static int[] a;
   private static int n;
   private static int left;
   private static int right;
   private static int largest;


   public static void buildheap(int []a) {
      n = a.length-1;
      for(int i=n/2; i>=0; i--){
         maxheap(a,i);
      }
   }

   public static void maxheap(int[] a, int i) {
      left = 2*i;
      right = 2*i+1;

      if(left <= n && a[left] > a[i]){
         largest=left;
      } else {
         largest=i;
      }

      if(right <= n && a[right] > a[largest]) {
         largest=right;
      }
      if(largest!=i) {
         exchange(i, largest);
         maxheap(a, largest);
      }
   }

   public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
   }

   public static void sort(int[] myarray) {
      a = myarray;
      buildheap(a);
      for(int i=n; i>0; i--) {
         exchange(0, i);
         n=n-1;
         maxheap(a, 0);
      }
   }

   public static void main(String[] args) {
      int []numbers={55,2,93,1,23,10,66,12,7,54,3};
      System.out.println(Arrays.toString(numbers));
      sort(numbers);
      System.out.println(Arrays.toString(numbers));
   }
}