package tasks;

import java.util.Scanner;

public class LcmFInder
{
    static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Intiger : ");
        a = input.nextInt();
        System.out.println("Enter the Second Intiger : ");
        b= input.nextInt();
        int result = lcm(a,b);
        System.out.println("The Lowest Common Multiple is : "+result);

    }
    public static int lcm(int a, int b){
//        get the first 10 multiples of a & b
        int[] multiplesA = new int[10];
        int[] multiplesB = new int[10];
        int i =0;
        while(i<10){
            multiplesA[i] = (i*a);
            multiplesB[i]= (i*b);
            i++;
        }

//        take the array 1
        int result = 0 ;
        int j = 0;
        while (j<10){
            int temp = multiplesA[j];
            System.out.println();
            int k =0 ;
            while(k<10){
                int tempB = multiplesB[k];
                System.out.println(multiplesB[k]);
                if(tempB == temp){
                  result = tempB  ;
                }
                k++;
            }
            j++;
        }
    return result;
    }
}
