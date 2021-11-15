import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAnagrams {
    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("mom")); //should return 3
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
            int count = s1Map.getOrDefault(s1.charAt(i), 0);
            s1Map.put(s1.charAt(i), count+1);
        }
        for (int i = 0; i < s2.length(); i++) {
            int count = s2Map.getOrDefault(s2.charAt(i), 0);
            s2Map.put(s2.charAt(i), count+1);
        }
        return s1Map.equals(s2Map);
    }
}