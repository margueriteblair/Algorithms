public class SherlockAnagram2 {
    public static void main(String[] args) {
        
    }

    static int sherlockAndAnagrams(String s) {
        // char[] charArr = s.toCharArray();
        int pairsCount = 0;
        List<String> subStringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                subStringList.add(s.substring(i, j));
            }
        }
        
        for (int i = 0; i < subStringList.size(); i++) {
            for (int j = i+1; j < subStringList.size(); j++) {
                if (isMatching(subStringList.get(i), subStringList.get(j)) == true) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
        }
        
        static boolean isMatching(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            HashMap<Character, Integer> s1Map = new HashMap<>();
            HashMap<Character, Integer> s2Map = new HashMap<>();
            
            for (int i = 0; i < s1.length(); i++) {
                if (s1Map.containsKey(s1.charAt(i))) {
                    s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i))+1);
                } else {
                    s1Map.put(s1.charAt(i), 1);
                }
            }
            
            for (int i = 0; i < s2.length(); i++) {
                if (s2Map.containsKey(s2.charAt(i))) {
                    s2Map.put(s2.charAt(i), s2Map.get(s2.charAt(i))+1);
                } else {
                    s2Map.put(s2.charAt(i), 1);
                }
            }
            
            return s1Map.equals(s2Map);
        }
}