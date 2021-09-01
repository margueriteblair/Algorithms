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

    public static void whatFlavors(List<Integer> cost, int money) {
        // Write your code here
            Map<Integer, Integer> hm = new HashMap<>();
            
            for (int i = 0; i < cost.size(); i++) {
                hm.put(cost.get(i), i+1);
            }
            // System.out.println(hm);
            for (int i = 0; i < cost.size(); i++) {
                if (hm.containsKey(money-cost.get(i))) {
                    int ind1 = hm.get(money-cost.get(i));
                    int ind2 = i+1;
                    if (cost.get(ind2-1) + cost.get(ind1-1) == money && ind1 != ind2) {
                        System.out.println(Math.min(ind1, ind2) + " " + Math.max(ind1, ind2));
                        return;
                    }                
                }
            }
        }
}