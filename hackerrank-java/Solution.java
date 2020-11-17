import java.util.*;

public class Solution {
    static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }    
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer num : map.values()) {
            int value = counts.get(num) == null ? 0 : counts.get(num);
            counts.put(num, value+1);
        }
        if (counts.size() == 1) {
            return "YES";
        } else if (counts.size() > 2) {
            return "NO";
        } else if (counts.size() == 2) {
            Iterator<Integer> it = counts.keySet().iterator();
            ArrayList<Integer> twoVals = new ArrayList<>();
            for (Integer num : counts.values()) {
                twoVals.add(num);
            }
            Collections.sort(twoVals);
            System.out.println(twoVals);
            if (twoVals.get(0) != 1) {
                return "NO";
            } else if (twoVals.get(0) == 1 && twoVals.get(1) == 2) {
                return "NO";
            }              
        }
        return "YES";
    }

    public static void main(String[] args) {
        
        System.out.println(isValid("aaaabbcc"));
        System.out.println(isValid("aaaaabc"));
    }
}
//5000050000
//1784293664
//705082704