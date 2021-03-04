public class SearchInsert {
    public static void main(String[] args) {
        
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (i+1 < nums.length && nums[i] < target && nums[i+1] > target) {
                return i+1;
            }
            if (target < nums[0]) return 0;
            if (target > nums[nums.length -1]) return nums.length;
        }
        return 1;
    }
}