package CrackingTheCodingInterview.Udemy;

public class KthLargestElem {
    public static void main(String[] args) {
        
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}