package tasks;

public class Patterns {
    static void main(String[] args) {
        firstPattern();
        secondPattern();
    }
    public static void firstPattern(){
        int row =5;
        for(int i =0; i<row; i++){
            System.out.print("*");
            int j =0;
            while(j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
        }
    }
    public static void secondPattern(){
        int row =5;
        for(int i = 0; i<5; i++){
            System.out.println(" *");
            int j = 5;
            while(j>i){
                System.out.print(" * ");
                  j--;
            }

        }
    }
}
