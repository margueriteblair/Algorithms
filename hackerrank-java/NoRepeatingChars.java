public class NoRepeatingChars {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String temp = "";
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                temp = s.substring(i, j-1);
                if (!temp.contains(String.valueOf(s.charAt(j)))) {
                    maxLength = Math.max(temp.length(), maxLength);
                } else {
                    i = j;
                }
            }
        
    }
        return maxLength;
    }
}