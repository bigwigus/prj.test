import java.util.Arrays;

public class Task08 {

    public static void main(String[] args) {
        int[][] marr = new int[5][5];
        System.out.println(Arrays.deepToString(matrix(marr)));
        System.out.println(marr.length);
    }

    public static int[][] matrix(int[][] mArr){
        for(int i = 0; i < mArr.length; i++){
            for(int j = 0; j < mArr.length; j++){
                if(i == j){
                    mArr[i][mArr.length - 1 - j] = 1;
                }
            }

        }
        return mArr;
    }
}
