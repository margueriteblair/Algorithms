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

    public int removeDuplicates2(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length-1) {
                if (nums[i] == nums[i+1]) {
                    nums[i+1] = nums[i+2];
                    length--;
                    i++;
                }
            }
        }
        return length;
    }
}