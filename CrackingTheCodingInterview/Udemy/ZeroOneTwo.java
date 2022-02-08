import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZeroOneTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[] {2,1,2,0,0,0,2,1,2})));
    }

    //given an array of 0, 1, 2, sort it in place
    public static int[] sortArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        System.out.println(map);
        int i = 0;
            while (map.get(0) != 0) {
                arr[i] = 0;
                int count = map.get(0);
                map.put(0, count-1);
                i++;
            }
            while (map.get(1) != 0) {
                arr[i] = 1;
                int count = map.get(1);
                map.put(1, count-1);
                i++;
            }

            while (map.get(2) != 0) {
                arr[i] = 2;
                int count = map.get(2);
                map.put(2, count-1);
                i++;
            }
        System.out.println(map);
        return arr;
    }
}