public class NoRepeatingChars {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String temp = "";
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                temp = s.substring(i, j);
                if (isRepeating(temp)) {
                    maxLength = Math.max(maxLength, temp.length());
                }
            }
        
    }
        return maxLength;
    }
    
    public boolean isRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            
            int count = map.getOrDefault(str.charAt(i), 0);
            if (count > 1 || count+1 > 1) return false;
            map.put(str.charAt(i), count+1);
        }
        System.out.println(map);
        return true;
    }
}