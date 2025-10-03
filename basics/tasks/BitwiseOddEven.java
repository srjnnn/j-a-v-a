package tasks;

import java.util.Scanner;

public class BitwiseOddEven {
    static void main(String[] args) {
        System.out.println("Enter any string to check if its even or odd");
//
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        if((a&1)==1){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is even");
        }
    }
}
