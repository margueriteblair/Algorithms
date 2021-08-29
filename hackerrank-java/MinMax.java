public class MinMax {
    public static void main(String[] args) {
        
    }

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
            Collections.sort(arr);
            int minMax = arr.get(k-1) - arr.get(0);
            for (int i = 0; i < arr.size()-k; i++) {
                if (arr.get(i+k-1) - arr.get(i) < minMax) {
                    minMax = arr.get(k+i-1) - arr.get(i);
                }
            }
            return minMax;
        }
}