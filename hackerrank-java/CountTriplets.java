package hackerrank-java;

public class CountTriplets {
    public static void main(String[] args) {
        
    }

    static long countTriplets(List<Long> arr, long r) {
        Map<Integer, Long> map = new HashMap<>();
        Map<Long, Long> countMap = new HashMap<>();
        long count = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            map.put(i, arr.get(i));
            long c1 = countMap.getOrDefault(arr.get(i), 0L);
            countMap.put(arr.get(i), c1+1);
        }
        
        for (Map.Entry<Integer, Long> set : map.entrySet()) {
            long val = set.getValue();
            int i = set.getKey();
            if (map.containsValue(val*r) && map.containsValue(val*r*r)) {
                count += countMap.get(val);
                count += countMap.get(val*r);
                count += countMap.get(val*r*r);
            }
        }
        
        // System.out.println(map);
        // System.out.println(countMap);
        return count;
    }
}