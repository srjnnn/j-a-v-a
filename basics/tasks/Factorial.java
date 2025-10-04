package tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial : ");
        num = input.nextInt();

        long result = factorial(num);
        System.out.println("The factorial of "+num+" is  "+ result);

    }
    public static long factorial(int num){
        int result=1;
        while (num >0){
            result *=num;
            num--;
        }
        return result;

    }
}
