public class ShuffleArray {
    public static void main(String[] args) {
        
    }

    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        for (int i = 0, j = 0; i < nums.length/2; i++) {
            arr[j] = nums[i];
            arr[j+1] = nums[i+n];
            j+=2;
        }
        return arr;
    }
}