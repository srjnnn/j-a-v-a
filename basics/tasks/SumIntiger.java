package tasks;

import java.util.Scanner;

public class SumIntiger {
    static void main(String[] args) {
        System.out.println("Enter the number to find the sum of intiger...");
        int num,len;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
//        convert the int into char
        String character = String.valueOf(num);
//        length
       len =  character.length();
        System.out.println("length : "+len);
        System.out.println("char index 0 " + character.charAt(0));
       int i =0;
       int sum = 0;

       while (i<len){
//           get the index of the character
           char charr = character.charAt(i);
//           convert the char into the text
           int numeric = Character.getNumericValue(charr);
          sum +=numeric;
          i++;
       }
//       display the result
        System.out.println("The sum of the intiger "+num+" is "+sum);
    }
}
