public class FactorialTrailingZeros {
    public static void main(String[] args) {
        
    }
    public int trailingZeroes(int n) {
        int fac = 1;
        for (int i = n; i > 1; i--) {
            fac *= i;
        }
        
        String facString = String.valueOf(fac);
        int zeroCount = 0;
        int i = facString.length()-1;
        while (i >= 0 && facString.charAt(i) == '0') {
            System.out.println(facString.charAt(i));
            i--;
        }
        
        return zeroCount;
    }
}