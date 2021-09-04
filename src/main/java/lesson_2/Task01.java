package lesson_2;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,78,-4,-5, 1, 32,-5,0};
        System.out.println(Arrays.toString(sortArr(arr)));
    }

    public static int[] sortArr(int[] arr){
        int min = 0;
        for(int j = 0; j < arr.length; j++){
            min = arr[j];
            for(int i = j; i < arr.length; i++) {
                if (min >= arr[i]) {
                min = arr[i];
                arr[i] = arr[j];
                arr[j] = min;
                }
            }
        }
        return arr;
    }
}
