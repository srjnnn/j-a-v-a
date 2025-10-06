package tasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] newArray = new int[array.length];
        for(int i=array.length-1,j=0; i>=0; i--){
            newArray[j++] = array[i];
        }
        System.out.println("The new array is : "+ Arrays.toString(newArray));
    }
}
