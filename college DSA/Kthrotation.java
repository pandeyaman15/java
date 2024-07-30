import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Kthrotation {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5,6};
        int k = 2;
        k=k%arr.length;
        List<Integer> list=Arrays.asList(arr);
        Collections.reverse(list);
        Collections.reverse(list.subList(0, k));
        Collections.reverse(list.subList(k, list.size()));
        System.out.println(list);
    }
    
}
