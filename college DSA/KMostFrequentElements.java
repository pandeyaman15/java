import java.util.Arrays;

public class KMostFrequentElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] mostFrequent = findKMostFrequent(array, k);
        System.out.println( k + "  " + Arrays.toString(mostFrequent));
    }

    public static int[] findKMostFrequent(int[] array, int k) {
        int maxValue = Arrays.stream(array).max().orElse(0);
        int[] frequency = new int[maxValue + 1];
        for (int num : array) {
            frequency[num]++;
        }
        int[][] freqArray = new int[maxValue + 1][2];
        for (int i = 0; i <= maxValue; i++) {
            freqArray[i][0] = i;        
            freqArray[i][1] = frequency[i]; 
        }
        Arrays.sort(freqArray, (a, b) -> Integer.compare(b[1], a[1]));
        int[] result = new int[k];
        int count = 0;
        for (int i = 0; i <= maxValue && count < k; i++) {
            if (freqArray[i][1] > 0) { 
                result[count++] = freqArray[i][0];
            }
        }

        return result;
    }
}

