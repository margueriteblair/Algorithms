import java.util.Map;

public class Permutations {
    public static void main(String[] args) {
        
    }

    static void permutations(String s, String b) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), count+1);
        }

        for (int i = 0; i < b.length(); i++) {
            //check every s.length() chars and see if they meet the chars in the hashmap
        }
    }
}