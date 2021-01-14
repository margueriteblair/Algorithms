public class runtimecomplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (N-- > 0) {
            int testNum = scanner.nextInt();
            for (int i = 2; i <= Math.sqrt(testNum); i++) {
                if (testNum % i == 0) {
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
}