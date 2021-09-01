import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
    int[] arr = {0,1,0,1,0,1,0,0,0,1};
        System.out.println(Arrays.toString(invertArr(arr)));
    }

    public static int[] invertArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        return arr;
    }
}
