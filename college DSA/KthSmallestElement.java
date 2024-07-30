import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int kthSmallest = findKthSmallest(array, k);
        System.out.println(kthSmallest);
    }

    public static int findKthSmallest(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : array) {
            minHeap.add(num);
        }
        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }
        return minHeap.poll();
    }
}

