public class RemoveDups {
    public static void main(String[] args) {
        
    }

    public int removeDuplicates(int[] nums) {
        //removing elements from an array in place
        int i=0, j=0;
        
        while(j<nums.length){
            if(nums[j] == nums[i])  j++;
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
       
    }
}