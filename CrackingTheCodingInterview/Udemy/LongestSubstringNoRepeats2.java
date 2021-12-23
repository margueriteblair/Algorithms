public class LongestSubstringNoRepeats2 {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()-1; j++) {
                String sub = s.substring(i, j);
                if (!sub.contains(String.valueOf(s.charAt(j)))) {
                    if (sub.length()+1 > longest) {
                        longest = sub.length()+1;
                    }
                } else {
                    break;
                }
            }
        }
        return longest;
    }
}