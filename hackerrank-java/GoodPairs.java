public class GoodPairs {
    public static void main(String[] args) {
        
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numIdenticalPairs2(int[] nums) {
        int[] array=new int[101];
        int pairs=0;
        for(int val: nums){
            if(array[val]!=0){
                pairs+=array[val];
            }            
            array[val]++;
        }
        return pairs;
    }
}