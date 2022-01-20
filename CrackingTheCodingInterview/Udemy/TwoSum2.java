public class TwoSum2 {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(target-nums[i])) {
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            } else {
                map.put(i, nums[i]);
            }
        }
        return res;
    }
}