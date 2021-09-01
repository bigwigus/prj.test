import java.util.Arrays;

public class Task06 {

    public static void main(String[] args) {
        int[] arr = new int[8];
        System.out.println(Arrays.toString(whriter(arr)));
    }

    public static int[] whriter(int[] arr){
        int[] arr2 = {2, 5, 8, 11, 14, 17, 20 ,23};
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr2[i];
        }
        return arr;
    }
}
