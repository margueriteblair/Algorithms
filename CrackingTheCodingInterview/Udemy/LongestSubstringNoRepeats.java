package CrackingTheCodingInterview.Udemy;

public class LongestSubstringNoRepeats {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        
        int maxLen = 0;
        int i = 0;
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
            }
        }
    }
}