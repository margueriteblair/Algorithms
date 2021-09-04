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
            if (map.containsValue(map.get(i)*r) && map.containsValue(map.get(i)*r*r)) {
                int firstCount = 0;
                int secondCount = 0;
                for (long val : map.values()) {
                    if (val == (map.get(i)*r)) {
                        System.out.println(val);
                        firstCount++;
                    }
                    if (val == (map.get(i)*r*r)) {
                        System.out.println(val);
                        secondCount++;
                    }
                    count += firstCount;
                    count += secondCount;
                }
            }
        }
        
        return count;
    }
}