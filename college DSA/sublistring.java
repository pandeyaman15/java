public class sublistring {
    public static void main(String[] args) {
        String s = "nitin";
        if (s.length() == 0) {
            System.out.println("");
            return;
        }

        char[] charArray = s.toCharArray();
        int x = 0;

        for (int i = 1; i < s.length(); i++) {
            if (charArray[i] != charArray[x]) {
                x++;
                charArray[x] = charArray[i];
            }
        }
        String result = new String(charArray, 0, x + 1);
        System.out.println(result);
    }
}
