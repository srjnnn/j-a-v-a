package tasks;

import java.util.Scanner;

public class Bitwise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first Number");
         a = input.nextInt();
        System.out.println("Enter the first Number");
        b = input.nextInt();



//        Bitwise and
        System.out.println("The result is : "+(a&b));
    }
}
