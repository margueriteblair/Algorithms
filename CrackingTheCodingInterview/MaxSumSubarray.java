public class MaxSumSubarray {
    public static void main(String[] args) {
        System.out.println(findMaxSumSubarray(new int[] {4,2,1,7,8,1,2,8,1,0}, 3));
        System.out.println(smallestSubArray(new int[] {4,2,2,7,8,1,2,8,10}, 8));
        
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

    public static int smallestSubArray(int[] arr, int targetSum) {
        int j = 0; //this is the start of our window, i is the end of our window
        int currentSum = 0;
        int windowSize = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            while (currentSum >= targetSum) {
                windowSize = Math.min(windowSize, i - j + 1);
                currentSum -= arr[j];
                j++;

            }
        }
        return windowSize;
    }
}
