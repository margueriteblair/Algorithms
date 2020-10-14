public class boohoo {
    public static void main(String[] args) {
        boo(true);
        boo(null);
    }

    public static void boo(Object bool) {
        if (bool instanceof Boolean) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}