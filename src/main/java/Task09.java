public class Task09 {

    public static void main(String[] args) {
    int[] arr = {1,12,32,-32,22,12,4,8,-3,0};
        System.out.println(minArr(arr));
    }

    public static int minArr(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
          min = min >= arr[i] ? arr[i]:min;
        }
        return min;
    }
}
