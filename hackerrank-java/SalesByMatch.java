public class SalesByMatch {
    public static void main(String[] args) {
        
    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> sockMap = new HashMap<>();
        int pairs = 0;
        for (int i = 0; i < n; i++){
            int count = sockMap.getOrDefault(ar[i], 0)+1;
            sockMap.put(ar[i], count);
        }
        for (int val : sockMap.values()) {
            pairs += (val / 2);
        }
        return pairs;
    }
}