public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int minCost = 0;
        int increment = 1;
        for (int i = 1; i<=c.length; i++) {
            minCost += (increment * c[c.length-i]);
            if (i % k == 0) {
                increment++;
            }
        }
        return minCost;

    }

    public static void main(String[] args) {
        getMinimumCost(); //params
    }
}