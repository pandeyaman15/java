import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrDuplicate { 
    public static void main(String[] args) {
        Integer[] arr={4,6,12,4,6,1,0,2,32,0,1};
        List <Integer> list = Arrays.asList(arr);
        HashSet set= new HashSet(list);
        List<Integer> ans=new ArrayList<>(set);
        System.out.println(set);



    }
    
}
