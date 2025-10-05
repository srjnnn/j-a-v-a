package tasks;

import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        boolean isSorted = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = input.nextInt();
        int[] array = new int[size];


        for(int i = 0; i<size; i++){
            System.out.println("Enter the value for index [ " + i+" ]");
            int val = input.nextInt();
            array[i] = val;
        }

//        check if the array is sorted
        int currentElem = array[0];
        for(int i =0; i<size-1; i++){
            if(array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println("The array is sorted(ascending order) ? "+isSorted);
    }
}
