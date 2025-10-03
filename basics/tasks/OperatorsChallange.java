package tasks;

import java.util.Scanner;

public class OperatorsChallange {
    static void main(String[] args) {
//        positive negative or zero
        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number to check if its a positive or negative");
//
//        int a = input.nextInt();
//
//        if(a<0){
//            System.out.println("Negative");
//        }else if(a>0){
//            System.out.println("Positive");
//        }else{
//            System.out.println("Zero");
//        }

//        ODD or Even
//        System.out.println("Enter the number to check if its odd or even");
//        int a = input.nextInt();
//
//        if(a%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }


//        Greatest among three
//        int a,b,c;
//        System.out.println("Enter the First Number : ");
//        a = input.nextInt();
//        System.out.println("Enter the Second Number : ");
//        b= input.nextInt();
//        System.out.println("Enter the Third Number : ");
//        c=input.nextInt();
//
//        if(a>b && b>c){
//            System.out.println(a+" is greater");
//        }else if(b>a && a>c){
//            System.out.println(b + " is greater");
//        }else{
//            System.out.println(c + " is greater");
//        }

//Check if the year is a leap year
//
        System.out.println("Enter your marks to convert it into grades");

        int marks = input.nextInt();

        if(marks>=90){
            System.out.println("A");
        }else if(marks >75){
            System.out.println("B");
        }else if(marks>60){
            System.out.println("C");
        } else if (marks>30) {
            System.out.println("D");
        }else{
            System.out.println("Failed");
        }
    }
}
