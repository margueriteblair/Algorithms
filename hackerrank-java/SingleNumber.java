public class SingleNumber {
    public static void main(String[] args) {
        
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0)+1;
            map.put(nums[i], count);
        }
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() == 1) {
                return key.getKey();
            }
        }
        
        return 1;
    }
}