public class DivCount {
    public static void main(String[] args) {
        solution(6, 11, 2);
    }
    public static int solution(int A, int B, int K) {
        int base = (B-A) / K;
        return A % K != 0 ? base : base + 1;
    }
}