public class LongestSubstringNoRepeats2 {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int longest = 0;
        Set<Character> set = new HashSet<>();
        for (i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            for (int j = i+1; j < s.length()-1; j++) {
                set.add(s.charAt(j));
                if (set.size() != (j-i+1)) {
                    i = j;
                    set = new HashSet<Character>();
                } else if (longest < set.size()) {
                    longest = set.size();
                }
            }
        }
        return longest;
    }
}