public class MaxSubArray {
    public static void main(String[] args) {
        
    }
    public int solution(int[] A) {
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