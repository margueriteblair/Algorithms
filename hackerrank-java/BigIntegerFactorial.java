public class BigIntegerFactorial {
    public static void main(String[] args) {
        
    }

    static void extraLongFactorials(int n) {
        BigInteger ans = new BigInteger("1");        
        for (int i = 2; i <= n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);


    }
    
}