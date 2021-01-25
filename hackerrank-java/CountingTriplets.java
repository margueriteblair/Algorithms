import java.util.*;

public class CountingTriplets {
    public static void main(String[] args) {
        System.out.println(Math.pow(100, 3));
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

    static long countTriplets2(List<Long> arr, long r) {
        Map<Long, Long> leftMap = new HashMap<>();
        Map<Long, Long> rightMap = new HashMap<>();

    for (long item : arr) {
        rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
    }

    long count = 0;

    for (int i = 0; i < arr.size(); i++) {
        long midTerm = arr.get(i);
        long c1 = 0, c3 = 0;

        rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);

        if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
            c1 = leftMap.get(midTerm / r);
        }

        if (rightMap.containsKey(midTerm * r))
            c3 = rightMap.get(midTerm * r);

        count += c1 * c3;

        leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

    }
    return count;

    }
}