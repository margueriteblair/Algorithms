public class FirstAndLastPos2 {
    public static void main(String[] args) {
        
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        if (nums.length == 0) {
            return res;
        }
        
        int left = 0;
        int right = nums.length-1;
        
        int foundLeft = 0;
        int foundRight = nums.length-1;
        
        while (left != right) {
            int mid = (left+right)/2;

            if (target > nums[mid]) {
                left = mid+1;
            } else if (target < nums[mid]) {
                right = mid-1;
            } else if (target == nums[mid]) {
                left = mid;
                right = mid;
            }
            if (nums[left] == target) {
                foundLeft = left;
                while (left >= 0 && nums[left] == target) {
                    foundLeft = left;
                    left--;
                }
            }
            if (nums[right] == target) {
                foundRight = right;
                while (right <= nums.length-1 && nums[right] == target) {
                    right++;
                    foundRight = right;
                }
            }
        }
        res[0] = foundLeft;
        res[1] = foundRight;
        return res;
    }
}