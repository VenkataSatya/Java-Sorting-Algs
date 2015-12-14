/**
 * Created by Venkata on 8/14/2015.
 *
 *
 * program to print single numbers even it occurs multiple times in an array, ie, removing duplicates in an array
 */
public class DisplayUniqueElemArray {

    public static void printDistinctElements(int[] arr){

        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){           // 0:1
                    isDistinct = true;          // 0:2,1:2
                    break;                      // 0:3,1:3,<breaks here> 2:3
                }                               // 0:4,1:4,2:4,3:4
            }                                   // 0:5,1:5,2:5,3:5,4:5
                                                //5  Position of i 0 - 2  Position of i 1 - 7  Position of i 2 - 4  Position of i 4 - 8  Position of i 6 - 3  Position of i 8 -
            if(!isDistinct){                    // Output: 5 2 7 4 8 3
                System.out.print(arr[i]+ " ");
            }

        }
    }

    public static void main(String a[]){

        int[] nums = {5,2,7,2,4,8,7,2,3};
        DisplayUniqueElemArray.printDistinctElements(nums);
    }
}

