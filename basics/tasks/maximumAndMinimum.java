package tasks;

import java.util.Scanner;

public class maximumAndMinimum {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the size of an array : ");
      int size = input.nextInt();
      int[] array = new int[size];


      for(int i = 0; i<size; i++){
          System.out.println("Enter the value for index [ " + i+" ]");
          int val = input.nextInt();
          array[i] = val;
      }

      int[] result = maxmin(array);
      int max = result[0];
      int min = result[1];

      System.out.println("The maximum value is : "+max+" and minimum value is : "+min);


    }

    public static int[] maxmin(int[] array){
      int[] mami=new int[2];
//         since we got the address of an array
        mami[1] = array[0];
        mami[0]=array[0];
        int currentMinElem = array[0];
        int currentMaxElem=array[0];
        for(int i =1; i<array.length; i++){
//            maximum
             if(currentMaxElem<array[i]){
                 currentMaxElem=array[i];
             }
             mami[0]=currentMaxElem;

//             minimum
            if(currentMinElem>array[i]){
                currentMinElem=array[i];
            }
            mami[1]=currentMinElem;


        }





      return mami;
    }
}
