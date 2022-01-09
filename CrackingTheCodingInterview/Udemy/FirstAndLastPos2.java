public class FirstAndLastPos2 {
    public static void main(String[] args) {
        
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int firstIndex = binarySearch(nums, 0, nums.length-1, target);
        if (firstIndex == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int i = firstIndex;
        int j = firstIndex;
        while (i >= 0 && nums[i] == target) {
            res[0] = i;
            i--;
        }
        
        while (j <= nums.length-1 && nums[j] == target) {
            res[1] = j;
            j++;
        }
        
        return res;
    }
    
    public int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else if (arr[mid] > target) {
                right = mid-1;
            }
        }
        return -1;
    }
}