public class RepeatedString {
    public static void main(String[] args) {
        
    }

    static long repeatedString(String s, long n) {
        String newStr = StringUtils.repeat(s, (int)n);
        System.out.println(newStr);
        if (s.length() == 1 && s.equals("a")) return n;
        long aCount = 0;
        for (long i = 0; i < n; i++) {
            if (newStr.charAt((int)i) == 'a') aCount++;
        }
        return aCount;
    }
}