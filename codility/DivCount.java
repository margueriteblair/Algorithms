public class DivCount {
    public static void main(String[] args) {
        
    }

    public static int solution(int A, int B, int K) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) count++;
        }
        return count;
    }
}