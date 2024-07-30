import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] array = {100, 4, 200, 1, 3, 2};
        int longestSequence = findLongestConsecutiveSequence(array);
        System.out.println( longestSequence);
    }

    public static int findLongestConsecutiveSequence(int[] array) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : array) {
            numSet.add(num);
        }

        int longestStreak = 0;
        for (int num : array) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

