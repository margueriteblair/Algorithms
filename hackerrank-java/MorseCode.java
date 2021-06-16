public class MorseCode {
    public static void main(String[] args) {
        
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alpha = "abcdefchijklmnopqrstuvwxyz";
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            map.put(alpha.charAt(i), morse[i]);
        }
        
        Set<String> set = new HashSet<>();
        
        System.out.println(map);
        return 1;
    }
}