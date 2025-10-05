package tasks;

import java.util.Scanner;

public class OccuranceNumber {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = input.nextInt();
            int[] array = new int[size];


            for(int i = 0; i<size; i++){
                System.out.println("Enter the value for index [ " + i+" ]");
                int val = input.nextInt();
                array[i] = val;
            }

        System.out.println("Enter the intiger to find its occurance : ");
            int number = input.nextInt();
            int count = 0;
            for (int i = 0; i<size; i++){
                if(array[i]==number){
                    count++;
                }
            }
        System.out.println("The occurance of the element "+number+" in the array is "+count);
    }
}
