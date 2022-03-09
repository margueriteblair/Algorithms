public int lengthOfLongestSubstring(String s) {
    int longest = 0;
    int i = 0, j = 0;
    Set<Character> set = new HashSet<>();
    while (i < s.length()) {
        if (set.contains(s.charAt(i))) {
            set.remove(s.charAt(j));
            j++;
        } else {
            set.add(s.charAt(i));
            i++;
        }
        longest = Math.max(set.size(), longest);
    }
    return longest;
}