public class FactorialTrailingZeros {
    public static void main(String[] args) {
        
    }
    public int trailingZeroes(int n) {
        BigInteger fac = BigInteger.ONE;
        for (int i = n; i > 1; i--) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        
        String facString = String.valueOf(fac);
        System.out.println(facString);
        int zeroCount = 0;
        int i = facString.length()-1;
        while (i >= 0 && facString.charAt(i) == '0') {
            System.out.println(facString.charAt(i));
            zeroCount++;
            i--;
        }
        
        return zeroCount;
    }

    public int trailingZeroes2(int n) {
        if (n < 5 || n == 0) {
            return 0;
        }
        
        int zeroCount = 0;
        while (n >= 5) {
            zeroCount += (n / 5);
            n = n / 5;
        }
        
        return zeroCount;
    }
}