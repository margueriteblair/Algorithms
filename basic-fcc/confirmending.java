public class confirmending {
    public static void main(String[] args) {
        confirm("Hello world", "no");
    }

    public static boolean confirm(String str, String target) {
        if (str.endsWith(target)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}