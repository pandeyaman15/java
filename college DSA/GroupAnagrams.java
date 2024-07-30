
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(List<String> strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
