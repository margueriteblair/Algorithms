import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAnagrams {
    public static void main(String[] args) {
        sherlockAndAnagrams("mom"); //should return 3
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
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
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