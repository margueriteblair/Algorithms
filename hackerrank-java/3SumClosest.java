public class 3SumClosest {
    public static void main(String[] args) {
        
    }

    public int threeSumClosest(int[] nums, int target) {
        
        int start = 0, end = 0, n = nums.length, minimum = 100000, ans=0;
        
        Arrays.sort(nums);
        
        for(int i=0; i< n; i++){
            start = i + 1;
            end = n-1;
            
            while(start < end){
                int temp = nums[start]+ nums[end]+ nums[i];
                if(Math.abs(target - temp) < minimum){
                    ans = temp;
                    minimum = Math.abs(target - temp);
                }
                if(temp == target){ 
                    ans = temp;
                    break;
                }else if(temp > target){
                    end--;
                } else {
                    start ++;
                }
                
            } 
        }
        return ans;
        
    }
}