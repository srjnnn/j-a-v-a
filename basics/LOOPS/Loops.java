package LOOPS;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
//        WHile loop
//      Task ask the user to take the number three times
        int a,b,c;
        Scanner input = new Scanner(System.in);
        int num =1;
        while(num<=3){
            System.out.println("Enter the number "+num+" : ");
            a = input.nextInt();
            System.out.println("the number is  "+a);
            num++;
        }
    }
}
