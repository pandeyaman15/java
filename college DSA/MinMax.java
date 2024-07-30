import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 3, 9, 2, 6, 4, 7, 0};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        if (minIndex != -1) {
            arr[minIndex] = 2;
        }
        if (maxIndex != -1) {
            arr[maxIndex] = 10;
        }
        System.out.println(Arrays.toString(arr));
    }
}
