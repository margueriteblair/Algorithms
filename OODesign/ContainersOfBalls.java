package OODesign;

public class ContainersOfBalls {
    public static void main(String[] args) {
        
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int mostBalls = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int currentLimit = i;
            while (currentLimit > 0) {
                sum += currentLimit % 10;
                currentLimit /= 10;
            }
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
            mostBalls = Math.max(mostBalls, sumMap.get(sum));
        }
        return mostBalls;
    }
}