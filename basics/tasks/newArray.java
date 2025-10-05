package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class newArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7};

        System.out.println("Enter the specific number that you would want to delete : ");
        int elemRemove = input.nextInt();
        int indexToRemove = -1;

        for(int i =0; i<array.length; i++){
            if(array[i]==elemRemove){
                System.out.println("Elem found at index "+ i);
                indexToRemove=i;
            }
        }

        if(indexToRemove==-1){
            System.out.println("Element not found");
        }else{
//            now create the new array
            int[] newArray = new int[array.length-1];
            for(int i=0,j=0; i<array.length; i++){
                if(i !=indexToRemove){
                   newArray[j++]=array[i];
                }
            }
            System.out.println("New array is : "+ Arrays.toString(newArray));
        }

    }
}
