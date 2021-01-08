public class RopeTie {
    public static void main(String[] args) {
        solution(4, new int[] {1,2,3,4,5,6,7,8,9});
    }

    public static int solution(int K, int[] A) {
        int count = 0;
        int ropeLength = 0;
        for (int rope : A) {
            ropeLength += rope;
            if (ropeLength >= K) {
                count++;
                ropeLength = 0;
            }
        }
        return count;
    }
}