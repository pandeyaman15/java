public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String longestSubstring = LongestSubstring(s);
        System.out.println(longestSubstring);
    }
    public static String LongestSubstring(String s) {
        String longestSubstring = "";
        int maxLength = 0;
        int start = 0;
        int[] lastIndex = new int[100]; 
        for (int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);
            start = Math.max(lastIndex[currChar], start);
            int currLength = end - start + 1;
            if (currLength > maxLength) {
                maxLength = currLength;
                longestSubstring = s.substring(start, end + 1);
            }
            lastIndex[currChar] = end + 1;
        }

        return longestSubstring;
    }
}

