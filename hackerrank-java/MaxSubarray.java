public class MaxSubarray {
    public static void main(String[] args) {
        
    }

    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > currSum) {
                currSum = sum;
            }
            }
        }
        return currSum;
        
    }
}