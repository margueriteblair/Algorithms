public class CharacterArray {
    public static void main(String[] args) {
        
    }

    public String minWindow(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (!charMap.containsKey(t.charAt(i))) {
                charMap.put(t.charAt(i), 1);
            } else {
                charMap.put(t.charAt(i), charMap.get(t.charAt(i))+1);
            }
        }
        System.out.println(charMap);
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> charMap2 = new HashMap<Character, Integer>(charMap);
            for (int j = i; j < s.length(); j++) {
                if (charMap2.containsKey(s.charAt(j))) {
                    charMap2.put(s.charAt(j), charMap2.get(s.charAt(j))-1);
                    if (charMap2.get(s.charAt(j)) == 0) {
                        charMap2.remove(s.charAt(j));
                    }
                }
                if (charMap2.isEmpty()) {
                    if (!answer.equals("") && s.substring(i, j).length() < answer.length()) {
                        answer = s.substring(i, j+1);
                    } else if (answer.equals("")) {
                        answer = s.substring(i, j+1);
                    }
                }
            }
        }
        return answer;
        
    }
}