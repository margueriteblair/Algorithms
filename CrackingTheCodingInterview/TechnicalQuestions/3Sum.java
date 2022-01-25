public class 3Sum {
    public static void main(String[] args) {
        
    }

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                int target = nums[i];
                for (int j = 0; j < nums.length; j++) {
                    if (map.containsKey(target-nums[j]) && i != j && j != map.get(target-nums[j]) && i != map.get(target-nums[j])) {
                        List<Integer> curr = new ArrayList<>();
                        curr.add(nums[i]);
                        curr.add(nums[j]);
                        curr.add(target-nums[j]);
                        res.add(curr);
                    } else {
                        map.put(nums[j], j);
                    }
                }
            }
            
            System.out.println(map);
            return res;
        }
}