public class OddSum {
    public static void main(String[] args) {
        
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j-i+1)%2 == 1) {
                    sum += arr[j];
                }
            }
        }
        return sum;
    }
}