public class Dominator {
    public static void main(String[] args) {
        
    }

    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            }else {
                map.put(A[i], map.get(A[i])+1);
            }
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() > A.length/2) {
                int index = IntStream.range(0, A.length)
                .filter(i -> set.getKey().equals(A[i])).findFirst()
                .orElse(-1);
                return index;
            }
        }
        return -1;
    }
}