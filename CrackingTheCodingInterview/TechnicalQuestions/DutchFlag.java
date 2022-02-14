public class DutchFlag {
    public static void main(String[] args) {
        
    }

    public void sortColors(int[] nums) {
        // [2,2,2]
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[0] > 0) {
                nums[i] = 0;
                count[0]--;
                continue;
            } else if (count[1] > 0) {
                nums[i] = 1;
                count[1]--;
                continue;
            } else {
                nums[i] = 2;
                count[2]--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}