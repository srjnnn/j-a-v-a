package FunctionReturn;

import java.util.Scanner;

public class ReturnFunction {
//    Ask the user to input the two numbers and then print the result of their sum using the function with the parms and return value
static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the firstNumber : ");
    int a = input.nextInt();
    System.out.println("Enter the SecondNumber : ");
     int b = input.nextInt();

//     call the method
    int result = addition(a,b);
    System.out.println("The sum is : "+ result);
}
public static int addition(int a , int b){
    return a+b;
}
}
