public class TwoStrings {
    public static void main(String[] args) {
        
    }

    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1Map.containsKey(s1.charAt(i))) {
                s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i))+1);
            } else {
                s1Map.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s1Map.containsKey(s2.charAt(i))) return "YES";
        }
        // System.out.println(s1Map);
        return "NO";


    }

    static String twoStrings2(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            int count = s1Map.getOrDefault(s1.charAt(i), 0)+1;
            s1Map.put(s1.charAt(i), count);
        }
        
        for (int i = 0; i < s2.length(); i++) {
            if (s1Map.containsKey(s2.charAt(i))) {
                return "YES";
            }
        }
        return "NO";
    }

    public static String twoStrings3(String s1, String s2) {
        // Write your code here
        String flag = "NO";
        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
            flag = "YES";
        }
        return flag;
        }
}