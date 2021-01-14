public class runtimecomplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (N-- > 0) {
            int val = scanner.nextInt();

            for(int i=2; i<=val/i; i++){
                if(val%i==0) val=1;
            }

            if(val==1) System.out.println("Not prime");
            else System.out.println("Prime");
        }
    }
}