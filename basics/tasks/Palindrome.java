package tasks;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to take the input : ");
        int a = input.nextInt();

        int orignalNumber = a;
        int reversedNumber=0;
        int remainder =0;

        while(a>0){
            remainder = a%10;
            reversedNumber = (reversedNumber*10)+remainder;
            a=a/10;
        }
        System.out.println("Reversed number  : "+reversedNumber);
        if(reversedNumber==orignalNumber){
            System.out.println("The number is Palindrome : "+orignalNumber);
        }else{
            System.out.println("The number is not Palindrome : "+orignalNumber);
        }

    }
}
