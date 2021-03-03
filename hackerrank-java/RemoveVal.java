public class RemoveVal {
    //removing elements from an array in-place
    public int removeElement(int[] nums, int val) {
        int len = 0 ;
        if(Objects.isNull(nums) || nums.length == 0){
            return len ;
        }
        for(int num : nums){
            if(num != val){
                 nums[len++] = num ;
            }
        }
        return len;
    }

    public int removeElement2(int[] nums, int val) {
            int i = 0;
            int j = 0;
            while (j < nums.length) {
                if (nums[j] == val) {
                    j++;
                } else {
                    nums[i] = nums[j];
                    i++;
                    j = i;
                }
            }
            return i-1;
    }
}