package tasks;

import java.util.Scanner;

public class OddNumberSum {
    static void main(String[] args) {
//        get the end of the number
        int result,finalNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        finalNumber = input.nextInt();

        result = getNum(finalNumber);
        System.out.println("The sum of the odd number till the end is : "+result);

    }
    public static int getNum(int finalNumber){
        int i =0;
        int sum =0;
        while (i<=finalNumber){
            if(i%2!=0){
                sum +=i;
            }
            i++;
        }
        return sum;
    }
}
