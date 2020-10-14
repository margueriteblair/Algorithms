public class repeatstring {
    public static void main(String[] args) {
        repeatString("abc", 3);
    }

    public static void repeatString(String str, int n) {
        String finalStr = "";
        for (int i = 0; i < n; i++) {
            finalStr += str;
        }
        System.out.println(finalStr);
    }
}