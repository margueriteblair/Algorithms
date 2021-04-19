public class PangramSentence {
    public boolean checkIfPangram(String sentence) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alpha.length(); i++) {
            if (!sentence.contains(String.valueOf(alpha.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}