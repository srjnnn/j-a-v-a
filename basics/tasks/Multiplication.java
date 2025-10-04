package tasks;

import java.util.Scanner;

public class Multiplication {
    static void main(String[] args) {
//        multiplication of table 5
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to display the table : ");
        number = input.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(number + " * "+i+" = "+ (i*number));
            i++;
        }
    }
}
