public class MaxSlice {
    public static void main(String[] args) {
        solution(new int[] {1,2,3,4,5});
    }

    public static int solution(int[] A) {
        int maxProfit = 0;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[j]-A[i] > maxProfit) {
                    maxProfit = A[j]-A[i];
                }
            }
        }
        return maxProfit;
    }

    public static int solution2(int[] A) {
        int globalMax = 0;
        int localMax = 0;
        for (int i = 1; i < A.length; i++) {
            int d = A[i] - A[i-1];
            localMax = Math.max(d, localMax+d);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }


}