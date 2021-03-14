public class MajorityElement {
    public static void main(String[] args) {
        
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}