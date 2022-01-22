public class UniqueSubstring {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        //can use sliding window technique
        int i = 0, j = 0;
        int longest = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                longest = Math.max(set.size(), longest);
                i++;
            } else {
                set.remove(s.charAt(i));
                j++;
            }
        }
        return longest;
    }
}