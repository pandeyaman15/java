import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TopTwoMax {
    public static void main(String[] args) {
        
        Integer[] arr = {3, 5, 1, 4, 2, 8, 7, 6};
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list, Collections.reverseOrder());
        
        int maxNumber1 = list.get(0);
        int maxNumber2 = list.get(1);
        System.out.println(  maxNumber1 + " and " + maxNumber2);
    }
}

