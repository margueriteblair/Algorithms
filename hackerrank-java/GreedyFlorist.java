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

    static int getMinimumCost2(int k, int[] c) {
        Arrays.sort(c);
        int minCost = 0;
        int increment = 1;
        for (int i = c.length-1; i >= 0; i--) {
            minCost += (c[i] * increment);
            if ((c.length-i)%k == 0) {
                System.out.print(increment);
                increment++;
            }
            
        }
        return minCost;

    }

    public static void main(String[] args) {
        getMinimumCost(3, new int[] {1,2,3,4,5}); //params
    }
}