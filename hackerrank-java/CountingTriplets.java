public class CountingTriplets {
    public static void main(String[] args) {
        
    }

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Integer> countMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!countMap.containsKey(arr.get(i))) {
                countMap.put(arr.get(i), 1);
            } else {
                countMap.put(arr.get(i), countMap.get(arr.get(i))+1);
            }
        }
        for (Map.Entry<Long, Integer> set : countMap.entrySet()) {
            if (countMap.containsKey(set.getKey()*r) && countMap.containsKey(set.getKey()*r*r)) {
                List<Integer> list = new ArrayList<>();
                list.add(set.getValue());
                list.add(countMap.get(set.getKey()*r));
                list.add(countMap.get(set.getKey()*r*r));
                count += Collections.max(list);
            }
        }
        System.out.println(countMap);
        return count;
    }
}