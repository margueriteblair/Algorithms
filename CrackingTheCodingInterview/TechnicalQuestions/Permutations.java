import java.util.HashMap;
import java.util.Map;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutations("abbc", "cbabadcbbabbcbabaabccbabc")); //expected output is 7
    }

    static int permutations(String s, String b) {
        int countPerms = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), count+1);
        }

        for (int i = 0; i < b.length()-s.length(); i++) {
            //check every s.length() chars and see if they meet the chars in the hashmap
            String sub = b.substring(i, i+s.length());
            Map<Character, Integer> copy = map;
            if (checkContents(sub, copy)) {
                countPerms++;
            }
        }

        return countPerms;
    }

    static boolean checkContents(String str, Map<Character, Integer> map) {
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                return false;
            } else {
                int count = map.get(str.charAt(i));
                System.out.println(count);
                if (count == 0) {
                    map.remove(str.charAt(i));
                } else {
                    count--;
                    map.put(str.charAt(i), count);
                }
                System.out.println(map);
            }
        }
        
        return map.isEmpty() ? true : false;
    }
}