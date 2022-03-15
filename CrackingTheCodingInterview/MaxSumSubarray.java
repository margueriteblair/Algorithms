public class MaxSumSubarray {
    public static void main(String[] args) {
        System.out.println(findMaxSumSubarray(new int[] {4,2,1,7,8,1,2,8,1,0}, 3));
        
    }

    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxVal = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (i >= k-1) {
                maxVal = Math.max(currentSum, maxVal);
                currentSum -= arr[i-(k-1)];
            }
        }
        return maxVal;
    }
}
