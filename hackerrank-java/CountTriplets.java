

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
                long c1 = countMap.get(val);
                long c2 = countMap.get(val*r);
                long c3 =countMap.get(val*r*r);
                long max = Math.max(c1, c2);
                max = Math.max(c3, max);
                count += max;
            }
        }
        
        System.out.println(map);
        System.out.println(countMap);
        return count;
    }
}