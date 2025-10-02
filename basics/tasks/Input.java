package tasks;

import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declearing the object
        System.out.println("Enter your name : ");
        String name = input.nextLine();

//showing the input
        System.out.println("Hello, "+name+" Welcome to pikachu");
    }
}
