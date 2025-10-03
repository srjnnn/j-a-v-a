package Functions;

public class ReversePatterns {
    static void main(String[] args) {
            reversePattern();
    }
    public static void  reversePattern(){
        int row = 0 ;
        while(row<5){
            System.out.print("*");
            int i = 4;
            while(i>row){
                i--;
                System.out.print("*");
            }

            System.out.println();
            row++;
        }
    }
}
