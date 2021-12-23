public class LongestSubstringNoRepeats2 {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Boolean> map = new HashMap<>();
            int currentLength = 0;
            for (int j = i; j < s.length(); j++) {
                if (!map.containsKey(s.charAt(j))) {
                    currentLength++;
                    map.put(s.charAt(j), true);
                    longest = Math.max(currentLength, longest);
                } else {
                    break;
                }
            }
        }
        return longest;
    }
}