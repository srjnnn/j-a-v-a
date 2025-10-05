package tasks;

import java.util.Scanner;

public class Armstrong {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check if its armstrong : ");
        int a = input.nextInt();

//        check the number length
        String characters = String.valueOf(a);
        int length = characters.length();

        int result =0;

//        separate the digits and apply the power to the number
        for (int i =0; i<length; i++){
            String Char = String.valueOf(characters.charAt(i));
            int digits = Integer.parseInt(Char);
            result += Math.pow(digits,length);
        }
        if(result == a){
            System.out.println("The number is Armstrong");
        }else{
            System.out.println("The number is not Armstrong");
        }


    }
}
