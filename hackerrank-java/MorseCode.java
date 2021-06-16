public class MorseCode {
    public static void main(String[] args) {
        
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            map.put(alpha.charAt(i), morse[i]);
        }
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(toMorseCode(words[i], map));
        }
        System.out.println(map);
        return set.size();
    }
    
    public static String toMorseCode(String word, Map<Character, String> map) {
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
            res += map.get(word.charAt(i));
        }
        
        return res;
    }
}