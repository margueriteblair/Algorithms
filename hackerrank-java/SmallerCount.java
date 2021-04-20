public class SmallerCount {
    public static void main(String[] args) {
        
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smallerCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    smallerCount++;
                }
            }
            smallerNums[i] = smallerCount;
        }
        return smallerNums;
    }
}