package tasks;

public class Swap{
    static void main(String[] args) {

        int a = 3;
        int b =5;
        System.out.println("a = "+a+" b = "+b);

        int temp; //declearing the temp variable

        temp = a ;

        a = b;
        b=temp;

        System.out.println("a = "+a+" b = "+b);
    }
}