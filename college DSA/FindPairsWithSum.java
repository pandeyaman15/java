import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairsWithSum {
    public static void main(String[] args) {

        int[] array = {1, 5, 7, -1, 5};
        int k = 6;
        List<int[]> pairs = findPairsWithSum(array, k);
        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }

    public static List<int[]> findPairsWithSum(int[] array, int k) {
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : array) {
            int complement = k - num;
            if (seen.contains(complement)) {
                pairs.add(new int[]{num, complement});
            }
            seen.add(num);
        }

        return pairs;
    }
}

