public class 3Sum {
    public static void main(String[] args) {
        
    }

    public static List<Integer[]> threeNumberSum(int[] array, int target) {
        // Write your code here.
            Arrays.sort(array); //sort the array first
            List<Integer[]> res = new ArrayList<Integer[]>();
            //the hashmap is the scaling data structure that leaves us with O(N)
            for (int i = 0;i < array.length-2; i++) {
                int left = i+1;
                int right = array.length-1;
                while (left < right) {
                    int currSum = array[i] + array[left] + array[right];
                    if (currSum == target) {
                        Integer[] triplet = {array[i], array[left], array[right]};
                        res.add(triplet);
                        left++;
                        right--;
                    } else if (currSum < target) {
                        left++;
                    } else if (currSum > target) {
                        right--;
                    }
                }
            }
        return res;
      }
}