package tasks;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
//        check if the array is sorted
//        then merge them
        boolean isSorted = true;
        int[] array1 = {1,2,1};
        int[] array2 = {4,5,6};

        for(int i =array1.length-1; i>0; i--){
            if(array1[i] <array1[i-1] || array2[i]<array2[i-1]){
                isSorted =false;
                System.out.println("the array are not sorted");
                break;
            }
        }
        if(isSorted){
            int arrayLength = array1.length+array2.length;
            int[] mergedArray = new int[arrayLength];

            System.arraycopy(array1,0,mergedArray,0,array1.length);
            System.arraycopy(array2,0,mergedArray,array1.length,array2.length);

            System.out.println("The new sorted array is : "+ Arrays.toString(mergedArray));

        }

    }
}
