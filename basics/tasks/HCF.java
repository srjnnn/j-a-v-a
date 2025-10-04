package tasks;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int a,b ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        a=input.nextInt();
        System.out.println("Enter the Second number : ");
        b=input.nextInt();

        int result = hcf(a,b);
        System.out.println("The HCF is : " +result);

    }
    public static int hcf(int a, int b){
        int result = 1;
        boolean status = false;

//        Store the divisible in the array
        int[] arrA = new int[50];
        int[] arrB = new int[50];

       for(int i =1 ; i<a ; i++){
           if(a%i ==0){
               arrA[i-1] = i;
           }
       }
        for(int i =1 ; i<b ; i++){
            if(b%i ==0){
                arrB[i-1] = i;
            }
        }

//        get the length of the array
        int aLen = arrA.length;
        System.out.println(aLen);
        int bLen = arrB.length;
        int l =aLen;
        while(l>0 && status == false){
            int tempA = arrA[l-1];
            System.out.println(tempA);
            int m =bLen;
            while(m>0){
                if(arrB[m-1]==tempA && tempA !=0){
                    result = tempA;
                    status = true;
                    System.out.println("The Hcf is = "+tempA);
                    break;
                }
                m--;
            }
            l--;
        }
        return result;
    }
}
