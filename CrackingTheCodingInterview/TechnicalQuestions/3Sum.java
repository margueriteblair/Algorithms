public class 3Sum {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (map.containsKey(0 - nums[i] - nums[j]) && i != j && j != map.get(0-nums[i]-nums[j]) && i != map.get(0-nums[i]-nums[j])) {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(0-nums[i]-nums[j]);
                    Collections.sort(curr);
                    if (!res.contains(curr)) {
                        res.add(curr);
                    }
                } else {
                    map.put(nums[j], j);
                }
            }
        }
        
        System.out.println(map);
        return res;
    }
}