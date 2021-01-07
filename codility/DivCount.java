public class DivCount {
    public static void main(String[] args) {
        solution2(7, 11, 2);
    }

    public static int solution(int A, int B, int K) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) count++;
        }
        return count;
    }

    public static int solution2(int A, int B, int K) {
        // return B / K – (A / K) + (A % K == 0 ? 1 : 0);
        return B/K - (A/K) + (A%K == 0 ? 1 : 0);
    }
}