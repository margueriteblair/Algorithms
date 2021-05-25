public class OddSum {
    public static void main(String[] args) {
        
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                int[] sub = Arrays.copyOfRange(arr, i, j);
                System.out.println(Arrays.toString(sub));
                if ((j-i) % 2 == 1) {
                    for (int k = 0; k < sub.length; k++) {
                        sum += sub[k];
                    }
                }
            }
        }
        return sum;
    }
}