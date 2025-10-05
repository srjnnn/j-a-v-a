package tasks;

import java.util.Scanner;

public class ReverseDigit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digits to reverse : ");
        int digits = input.nextInt();
        String str = String.valueOf(digits);
//        get the length of the
        int len = str.length();
        System.out.println(str.charAt(2));
        String reversedDigit ="" ;
        for (int i =len-1;i>=0;i-- ){
           reversedDigit += str.charAt(i);
        }

        System.out.println("The reversed digit is : "+ reversedDigit);
    }
}
