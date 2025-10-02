package tasks;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int number1 = input.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = input.nextInt();

//        show the sum

        System.out.println("The sum is "+ (number1+num2));

    }
}
