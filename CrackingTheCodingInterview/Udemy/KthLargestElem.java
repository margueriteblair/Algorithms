package CrackingTheCodingInterview.Udemy;

public class KthLargestElem {
    public static void main(String[] args) {
        //for the most efficient way, ensure you're using quicksort
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}