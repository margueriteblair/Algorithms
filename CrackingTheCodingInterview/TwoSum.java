import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {1, 3, 7, 9, 2}, 11));
        System.out.println(twoSum(new int[] {}, 11));
    }

    public static String twoSum(int[] arr, int target) {
        if (arr.length == 0 || arr.length == 1) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target-arr[i])) {
                res[0] = i;
                res[1] = map.get(target-arr[i]);
            }
        }
        return Arrays.toString(res);
    }
}