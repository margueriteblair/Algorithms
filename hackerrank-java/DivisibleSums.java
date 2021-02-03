public class DivisibleSums {
    public static void main(String[] args) {
        divisibleSumPairs(3, new int[] {1,3,2,6,1,2});
    }

    static int divisibleSumPairs(int k, int[] ar) {
        int count = 0;
        Arrays.sort(ar);
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}