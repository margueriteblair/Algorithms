public class SplitBalancedString {
    public static void main(String[] args) {
        
    }
    public int balancedStringSplit(String s) {
        int balancedCount = 0;
        int lCount = 0;
        int rCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                lCount++;
            } else {
                rCount++;
            }
            
            if (lCount == rCount) {
                balancedCount++;
                lCount = 0;
                rCount = 0;
            }
        }
        
        return balancedCount;
    }
}