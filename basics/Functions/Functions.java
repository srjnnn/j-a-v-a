package Functions;

public class Functions {
    static void main(String[] args) {
//        printing the patterns using function
        Patterns();
    }

    public static void Patterns(){
            int row = 0;
            while(row<5){
                System.out.print("*");
                int i=0;
                while(i<row){
                    System.out.print("*");
                    i++;
                }
                System.out.println();
                row++;
            }
    }
}
