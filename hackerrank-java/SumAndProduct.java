public class SumAndProduct {
    public static void main(String[] args) {
        
    }

    public int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.valueOf(String.valueOf(str.charAt(i)));
            product *= Integer.valueOf(String.valueOf(str.charAt(i)));
        }
        return product - sum;
    }
}