package tasks;

public class TwoDaysArraysSumAverage {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int rows = array.length;
        int col = array[0].length;
        int elmCount = rows*col;
        int sum =0;

        for(int i=0; i<rows; i++){
            for(int j =0; j<col;j++){
                sum +=array[i][j];
            }
        }
        float avg = (float) sum /elmCount;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}
