package tasks;

import java.util.Scanner;

public class elem2DArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        System.out.println("Enter the elment to search in the array : ");
        Scanner  input = new Scanner(System.in);
        int elem = input.nextInt();
        boolean isFound = false;

        for(int i =0; i<array.length; i++){
               for(int j =0; j<array[0].length; j++){
                   if(array[i][j]==elem){
                       isFound=true;
                       break;
                   }
               }
        }

        if(isFound){
            System.out.println("Element found in the array");
        }else{
            System.out.println("Elem not found");
        }
    }
}
