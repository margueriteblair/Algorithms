public class ChocolatesByNumber {
    public static void main(String[] args) {
        solution(10, 4);
    }

    public static int solution(int N, int M) {
        boolean[] isAvailable = new boolean[N];
        Arrays.fill(isAvailable, true);
        int barCount = 0;
        for (int i = 0; i < N; i = (i + M) % N) {
            if (isAvailable[i] == false) break;
            barCount++;
            isAvailable[i] = false;
            
        }
        return barCount;
    }
}