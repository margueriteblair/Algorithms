package codility2;

public class CyclicRotation {
    public static void main(String[] args) {
        solution(new int[] {1, 2, 3, 4, 5}, 2);
    }

    public static int[] solution(int[] A, int K) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[(i+K)% A.length] = A[i];
        }
        return B;
    }
}