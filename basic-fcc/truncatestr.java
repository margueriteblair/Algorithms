public class truncatestr {
    public static void main(String[] args) {
        truncate("A-tisket a-tasket A green and yellow basket", 8);
    }

    public static void truncate(String str, int num) {
        if (str.length() > num) {
            System.out.println(str.substring(0, num) + "...");
        } else {
            System.out.println(str);
        }
    }
}