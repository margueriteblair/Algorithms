public class MaxSubArray {
    public static void main(String[] args) {
        
    }
    public int solution(int[] A) {
        int globalMax = 0;
        int localMax = 0;
        for (int i = 1; i < A.length; i++) {
            int d = A[i] - A[i-1];
            localMax = Math.max(d, localMax+d);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }

    public int maxSubArray2(int[] nums) {
        // Kadanes algorithm
        int maximum_sum = nums[0];
        int current_sum = maximum_sum;
        for(int i = 1; i < nums.length; i++){
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            maximum_sum = Math.max(maximum_sum, current_sum);
        }
        return maximum_sum;
    }
}