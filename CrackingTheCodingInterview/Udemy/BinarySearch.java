package CrackingTheCodingInterview.Udemy;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,3,4,5}, 4));
    }

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if (nums[left] == target) return left;
        if (nums[right] == target) return right;
        
        while (left != right && right >= 0 && left <= nums.length-1) {
            int mid = (left+right)/2;
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        
        return -1;
    }
}