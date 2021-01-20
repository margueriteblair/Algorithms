package codility2;

public class MaxCounter {
    public static void main(String[] args) {
        
    }

    public int[] solution(int N, int[] A) {
        int[] B = new int[N];
        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N+1) {
                Arrays.fill(B, maxCounter);
            } else {
                B[A[i]-1]++;
                if (B[A[i]-1] > maxCounter) {
                    maxCounter = B[A[i]-1];
                }
            }
        }
        return B;
    }
}