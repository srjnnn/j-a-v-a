package tasks;

public class ArrayPalendrome {
    public static void main(String[] args) {
        int[] array = {'a','b','a','n','a'};
        boolean isPalindrome = false;

       for(int i =array.length-1, j=0; i>=0; i--){
           if(array[j++]!=array[i]){
               isPalindrome=false;
               break;
           }else{
               isPalindrome=true;
           }
       }

        if(isPalindrome){
            System.out.println("The array is Palindrome");
        }else{
            System.out.println("The array is not palindrome");
        }
    }
}
