package tasks;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check if its a prime number");
        a = input.nextInt();
        boolean result = isPrime(a);

        System.out.println(result);
    }
    public static boolean isPrime(int a){
        boolean status = true;
        for (int i=2; i<a; i++){
            if(status == true && a>0 && a%i==0){
                status = false;
            }
        }
        return status;
    }
}
