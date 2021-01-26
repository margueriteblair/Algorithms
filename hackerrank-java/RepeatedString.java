public class RepeatedString {
    public static void main(String[] args) {
        
    }

    static long repeatedString(String s, long n) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        long repititions = n / (long)s.length();
        count *= repititions;
        
        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}