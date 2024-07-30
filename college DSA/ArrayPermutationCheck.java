import java.util.HashMap;
import java.util.Map;

public class ArrayPermutationCheck {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        boolean arePermutations = arePermutations(arr1, arr2);
        System.out.println( arePermutations);
    }

    public static boolean arePermutations(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        Map<Integer, Integer> frequencyMap1 = new HashMap<>();
        Map<Integer, Integer> frequencyMap2 = new HashMap<>();
        for (int num : arr1) {
            frequencyMap1.put(num, frequencyMap1.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            frequencyMap2.put(num, frequencyMap2.getOrDefault(num, 0) + 1);
        }
        return frequencyMap1.equals(frequencyMap2);
    }
}
