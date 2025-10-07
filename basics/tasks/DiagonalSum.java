package tasks;

import java.util.Arrays;

public class DiagonalSum {
    public static void main(String[] args) {
         int[][] arry = {{1,2,3},{4,5,6}};
         int l2r = 0;
//         indexing the array
        for (int i =0; i<arry.length; i++){
            for(int j =0; j<arry[0].length;j++){
                  if(i==j){
                      l2r +=arry[i][j];
                  }

            }
        }
        System.out.println("The sum of the diagonal(left 2 right) is : "+l2r);
        System.out.println("The twoD array looks like : "+ Arrays.deepToString(arry));

    }
}
