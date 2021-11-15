import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAnagrams {
    public static void main(String[] args) {
        
    }

    static int sherlockAndAnagrams(String s) {
        int count = 0;
        List<String> substringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                substringList.add(s.substring(i, j));
            }
        }
        System.out.println(substringList);
        for (int i = 0; i < substringList.size(); i++) {
            for (int j = i+1; j < substringList.size(); j++) {
                if (isAnagram(substringList.get(i), substringList.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            int count = s1Map.getOrDefault(s1.charAt(i), 0);
            s1Map.put(s1.charAt(i), count++);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!s1Map.containsKey(s2.charAt(i))) {
                return false;
            } else if (s1Map.containsKey(s2.charAt(i))) {
                s1Map.put(s2.charAt(i), s1Map.get(s2.charAt(i))-1);
            }
            if (s1Map.get(s2.charAt(i)).equals(0)) {
                return false;
            }
        }
        return true;
    }
}