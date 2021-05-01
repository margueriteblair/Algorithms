public class IceCreamBars {
    public static void main(String[] args) {
        
    }

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int bars = 0;
        int i = 0;
        while (coins >= 0) {
            bars++;
            coins -= costs[i];
            i++;
        }
        return bars-1;
    }
}