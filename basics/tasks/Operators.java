package tasks;

import java.util.Scanner;

public class Operators {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float F,C;
//        System.out.println("Enter the first number");
//        a=input.nextInt();
//        System.out.println("Enter the second number");
//        b=input.nextInt();
//
//    perform all the arithmetic operations
//        System.out.println(a+b);
//        System.out.println(a/b);
//        System.out.println(a*b);
//        System.out.println(a-b);


//        Program to calculate the product of two floating numbers
//        System.out.println("Enter the First Float Number");
//        a = input.nextFloat();
//        System.out.println("Enter the Second Float Number");
//        b = input.nextFloat();
//
//        System.out.println("The product is "+a*b);


//        ferhnight to celcius
        System.out.println("Enter the degree in Ferhanight");
        F = input.nextFloat();
    C = (F-32)*5/9;
        System.out.println("The temperature in celsius is :  "+C);
    }
}
