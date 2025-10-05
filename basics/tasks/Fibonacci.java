package tasks;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number u want the fibonacci limit to:");
        n = input.nextInt();
        fibonacci(n);


    }
    public static void fibonacci(int n){
        System.out.println("Printing the fibonacci series");
            int n1 = 0;
            int n2 = 1;
            if(n>=1){
                System.out.print(n1);
            }
            if(n>=2){
                System.out.print(" ,"+n2);
            }
            for(int j =2; j<=n; j++){
                System.out.print(" ,"+(n1+n2));
              int  n3 = n1+n2;
                n1=n2;
                n2 =n3;
            }
        System.out.println();

    }
}
