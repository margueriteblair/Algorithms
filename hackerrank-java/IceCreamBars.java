public class IceCreamBars {
    public static void main(String[] args) {
        
    }

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        System.out.println(Arrays.toString(costs));
        int bars = 0;
        for (int i = 0; i < costs.length; i++) {
            if (coins-costs[i] >= 0) {
                coins -= costs[i];
                bars++;
            }
        }
        return bars;
    }
}