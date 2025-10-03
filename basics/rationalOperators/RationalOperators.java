package rationalOperators;

import java.util.Scanner;

public class RationalOperators {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        take the input from the user to check if they are eligible for voting
        System.out.println("Enter your age to check the eligiblity : ");
        int age = input.nextInt();

//        condition check
        if(age<18){
            System.out.println("Booo! you are under 18");
        }else{
            System.out.println("yay! you are eligible to take the lisence");
        }
    }
}
