public class ConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (consistencyCheck(allowed, words[i]) == true) {
                System.out.println(words[i]);
                count++;
            }
        }
        return count;
    }
    
    public boolean consistencyCheck(String allowed, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!allowed.contains(String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}