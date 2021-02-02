public class ArrayEquality {
    public static void main(String[] args) {
        
    }

    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = map.getOrDefault(arr[i], 0)+1;
            map.put(arr[i], count);
        }
        int max = 0;
        for (Integer val : map.values()) {
            if (val > max) max = val;
        }
        return arr.length - max;

    }
}