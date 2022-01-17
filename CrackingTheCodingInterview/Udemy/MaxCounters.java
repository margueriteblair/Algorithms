import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        
    }

    public static int[] solution(int n, int[] arr) {
        int[] res = new int[n];
        int maxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                Arrays.fill(res, maxVal);
            } else {
                res[arr[i-1]]++;
                maxVal = Math.max(res[arr[i-1]], maxVal);
            }
        }
        return res;
    }
}