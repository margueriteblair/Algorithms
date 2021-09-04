package hackerrank-java;

public class CountTriplets {
    public static void main(String[] args) {
        
    }

    static long countTriplets(List<Long> arr, long r) {
        long count = 0;
        Map<Integer, Long> map = new HashMap<>();
        
        for (int i = 0; i < arr.size(); i++) {
            map.put(i, arr.get(i));
        }
        
        System.out.println(map);
        for (int i = 0; i < arr.size(); i++) {
            if (map.containsValue(map.get(i)*r) && map.containsValue(map.get(i)*Math.pow(r, 2))) {
                count++;
            }
        }
        
        return count;
    }
}