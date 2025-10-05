package tasks;

import java.util.Scanner;

public class SumandAverage {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size=input.nextInt();

        int[] numbers = new int[size];

//        take the input from the user
        for(int i = 0; i<size; i++){
            System.out.println("Enter the value for index [ "+i+" ]");
            int val = input.nextInt();
            numbers[i] =val;
        }
//        access the array at the end
        int sum =0;
        double avg = 0;
        for(int i = 0; i<size; i++){
          sum +=numbers[i];
        }
        avg = (double) sum/size;


        System.out.println("The sum of the elements is : "+sum);
        System.out.println("The average of the elements is : "+ avg);

    }
}
