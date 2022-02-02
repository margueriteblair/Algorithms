public class BinarySearch2 {
    public static void main(String[] args) {
        
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        if (nums[left] == target) return left;
        if (nums[right] == target) return right;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid+1;
            }
        }
        return -1;
    }
}