public class BestStocks {
    public static void main(String[] args) {
        
    }

    public int maxProfit(int[] prices) {
        int current = 0;
        int global = 0;
        for (int i = 1; i < prices.length; i++) {
            int d = prices[i]-prices[i-1];
            current = Math.max(current, current+d);
            global = Math.max(global, current);
        }
        return global;
    }

    public int maxProfit2(int[] prices) {
        int profit=0,min=prices[0];
        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}