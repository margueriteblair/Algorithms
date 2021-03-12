public class BestStock2 {
    public static void main(String[] args) {
        
    }

    public int maxProfit(int[] prices) {
        int global = 0;
        for (int i = 0; i < prices.length-1; i++){
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] - prices[i] > global) {
                    global = prices[j] - prices[i];
                }
            }
        }
        return global;
    }
}
