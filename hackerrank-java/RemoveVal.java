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
}