import java.util.Scanner;

public class TWODArrays {
    static void main(String[] args) {
//        int[][] twoD = {{1,2,3},{4,5,6}};

//
//        System.out.println(twoD[0][0]);
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.println("Enter the number of row of the array : ");
        row=input.nextInt();
        System.out.println("Enter the number of column of the array : ");
        col = input.nextInt();
//       declare the array
        int[][] array2D = new int[row][col];
//        run the loop to take the row and column of the 2D array
        for(int i = 0; i<row; i++){
//             Run the loop again to access the column of each array
            for(int j =0; j<col; j++){
                System.out.println("Enter the cell value for row : [" + i + "] and column : [" + j+"]");
                int colVal = input.nextInt();
                array2D[i][j]=colVal;

            }
        }

        System.out.println("SHowing the value of the array : ");

        for (int i =0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(array2D[i][j]);
            }
        }

    }
}
