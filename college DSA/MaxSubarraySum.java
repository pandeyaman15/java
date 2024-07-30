public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = MaxSubarraySum(arr);
        System.out.println(maxSum);
    }

    public static int MaxSubarraySum(int[] arr) {
        int start = arr[0];
        int end = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (end+ arr[i] > arr[i]) {
                end += arr[i];
            } else {
                end = arr[i];
            }

            if (end > start) {
                start = end;
            }
        }

        return start;
    }
}