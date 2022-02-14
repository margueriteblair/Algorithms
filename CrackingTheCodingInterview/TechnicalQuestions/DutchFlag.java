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

    public void sortColors2(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        //0,0,1,1,2,2
        //m,l     h
        while (mid <= high) {
            if (nums[mid] == 2) {
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tmp;
                high--;
            } else if (nums[mid] == 0) {
                int tmp = nums[mid];
                nums[mid] = nums[low];
                nums[low]= tmp;
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }
}