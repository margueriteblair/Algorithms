public class InsertionSort {
    public static void main(String[] args) {
        sortArray(new int[] {22,33,66,11,44});
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j-1] > nums[j]) {
                int tmp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = tmp;
                j--;
            }
        }
        return nums;
    }
}