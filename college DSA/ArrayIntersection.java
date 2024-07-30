import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// import java.util.Collection;

public class ArrayIntersection {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};
        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);
        Set<Integer> intersection = findIntersection(list1, list2);
        System.out.println(intersection);
    }

    public static Set<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(list2);
        return intersectionSet;
    }
}
