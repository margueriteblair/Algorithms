public class MaxSubArray {
    public static void main(String[] args) {
        
    }

    public int solution(int[] A) {
        int local = 0;
        int global = 0;
        for (int i = 1; i < A.length; i++) {
            int diff = A[i] - A[i-1];
            local = Math.max(diff, local+diff);
            global = Math.max(global, local);
        }
        return global;
    }
}