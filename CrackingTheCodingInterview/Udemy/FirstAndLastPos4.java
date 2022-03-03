package CrackingTheCodingInterview.Udemy;

public class FirstAndLastPos4 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int firstPos = binarySearch(nums, 0, nums.length-1, target);
        if (firstPos == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int endPos = firstPos, startPos = firstPos;
        int temp1 = 0;
        int temp2 = 0;
        
        while (startPos != -1) {
            temp1 = startPos;
            startPos = binarySearch(nums, 0, startPos-1, target);
        }
        
        while (endPos != -1) {
            temp2 = endPos;
            endPos = binarySearch(nums, endPos+1, nums.length-1, target);
        }
        
        res[0] = temp1;
        res[1] = temp2;
        return res;
    }
    
    public static int binarySearch(int[] nums, int left, int right, int target) {
        while(left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid-1;
            }
        }
        return -1;
    }
}