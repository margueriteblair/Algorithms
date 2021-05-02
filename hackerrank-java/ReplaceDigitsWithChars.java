public class ReplaceDigitsWithChars {
    public static void main(String[] args) {
        
    }

    public String replaceDigits(String s) {
        let alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                s.charAt(i) = shift(s.charAt(i), Integer.valueOf(String.valueOf(s.charAt(i))));
            }
        }
    }
    
    public char shift(char c, int x) {
        
    }
}