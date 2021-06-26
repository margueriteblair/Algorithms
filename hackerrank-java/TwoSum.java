public class TwoSum {
    public static void main(String[] args) {
        
    }

    static public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return twoSum;
    }

    public static boolean twoSum2(int[] input, int targetVal) {
        int pointer1 = 0, pointer2 = input.length-1;
        while (pointer1 < pointer2) {
            int sum = input[pointer1] + input[pointer2];
            if (sum == targetVal) {
                return true;
            } else if (sum < targetVal) {
                pointer1++;
            } else {
                pointer2--;
            }
        }
        return false;
    }

    public int[] twoSum4(int[] nums, int target) {
        //hashmap
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>(); //hashmap for nums[i] and index
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    } 
}