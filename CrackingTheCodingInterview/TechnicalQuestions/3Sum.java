public class 3Sum {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        
        System.out.println(map);
        return res;
    }
}