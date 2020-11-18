public class Result {
    public static void main(String[] args) {
        System.out.println(countPalindromes("aaa"));
    }

    public static int countPalindromes(String s) {
        int count = s.length();
        int i = 0;
        while (i < s.length()) {
            int left = i-1;
            int right = i+1;
            while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
                count++;
            }
            left = i-1;
            right = i;
            while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
                count++;
            }
            i++;
        }
        return count;
    }
}