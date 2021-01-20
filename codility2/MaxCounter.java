package codility2;

import java.util.*;

public class MaxCounter {
    public static void main(String[] args) {
        solution(5, new int[] {1, 2, 4,3, 6, 2, 1});
    }

    public static int[] solution(int N, int[] A) {
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