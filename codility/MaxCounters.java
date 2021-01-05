public class MaxCounters {
    public static void main(String[] args) {
        
    }

    public int[] solution(int N, int[] A) {
        int currMax = 0;
        int[] result = new int[N];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                Arrays.fill(result, currMax);
            } else {
                result[A[i]-1]++;
                if (result[A[i]-1] > currMax) currMax = result[A[i]-1];
            }
        }
        // System.out.println(Arrays.toString(result));
        return result;
    }
}