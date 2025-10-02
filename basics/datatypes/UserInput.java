package datatypes;

import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        System.out.println("Enter your name please : ");
        Scanner input = new Scanner(System.in); //declearing an object
        String name = input.nextLine();
        System.out.println("Welcome "+name);
    }
}
