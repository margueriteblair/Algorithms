public class ReplaceDigitsWithChars {
    public static void main(String[] args) {
        
    }

    public static String alpha = "abcdefghijklmnopqrstuvwxyz";
    public String replaceDigits(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                s.replace(s.charAt(i), shift(s.charAt(i), Integer.valueOf(String.valueOf(s.charAt(i)))));
            }
        }
        return s;
    }
    
    public char shift(char c, int x) {
        char c2 = 'a';
        for (int i = 0; i < alpha.length(); i++) {
            if (alpha.charAt(i) == c) {
                c2 = alpha.charAt(i+5);
                return alpha.charAt(i+5);
            }
        }
        return c2;
    }
}