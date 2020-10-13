public class factorialize {
    public static void main(String[] args) {
        factorializeFunc(10);
    }

    public static long factorializeFunc(int num) {
        long factorial = 1;
        if (num == 0 || num == 1) {
            System.out.println(1);
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
            return factorial;
        }
    }
}