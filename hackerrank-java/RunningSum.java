public class RunningSum {
    public static void main(String[] args) {
        
    }

    public int[] runningSum(int[] nums) {
        int[] running = new int[nums.length];
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            running[i] = runningSum;
        }
        
        return running;
    }
}