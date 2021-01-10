public class PrimalityTest {
    public static void main(String[] args) {
        
    }    
    
    public static String primality(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }
}