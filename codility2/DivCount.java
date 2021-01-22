public class DivCount {
    public static void main(String[] args) {
        solution(6, 11, 2);
    }
    public int solution(int A, int B, int K) {
        double nStart = Math.ceil(A / (double) K);
        double nEnd = Math.floor(B / (double) K);
        return (int) (nEnd - nStart) + 1;
    }
}