package lesson_2;

import java.util.Arrays;

public class Task_2_04 {

    public static void main(String[] args) {
        int[] Arr2 = {2,4,6,7,5};
        int[] Arr = {2,4,5,62,2,-1,43,-2,-42,0,-11,5};
        System.out.println(Arrays.toString(shakeArray(Arr2)));
        System.out.println(Arr2.length / 2);
    }

    public static int[] shakeArray(int[] arr){
        int a = 0;
        for(int i =0; i < arr.length / 2; i++){
            a = arr[arr.length- 1 - i];
            arr[arr.length- 1 - i] = arr[i];
            arr[i] = a;
         }
        return arr;
    }
}
