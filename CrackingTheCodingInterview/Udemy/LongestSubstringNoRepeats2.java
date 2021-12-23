public class LongestSubstringNoRepeats2 {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int longest = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                set.add(s.charAt(j));
                if (s.substring(i, j+1).length() > set.size()) {
                    if (set.size() > longest) {
                        longest = set.size();
                    }
                    i = j-1;
                    set = new HashSet<Character>();
                }
            }
        }
        return longest;
    }
}