import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 5, 7};
        Integer[] arr2 = {2, 4, 6, 8};
        List<Integer> mergedList = mergeSortedArrays(arr1, arr2);
        System.out.println(mergedList);
    }

    public static List<Integer> mergeSortedArrays(Integer[] arr1, Integer[] arr2) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        list1.addAll(list2);
        Collections.sort(list1);

        return list1;
    }
}

