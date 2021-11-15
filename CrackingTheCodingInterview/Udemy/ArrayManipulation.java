import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        
    }

    static long arrayManipulation(int n, int[][] queries) {
        long[] resultingQueries = new long[n+1];
        long maxManipulation = 0;
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            resultingQueries[a-1] += k;
            resultingQueries[b] -= k;
        }
        System.out.println(Arrays.toString(resultingQueries));
        long max = 0;
        for (int i = 0; i < resultingQueries.length; i++) {
                maxManipulation += resultingQueries[i];
                max = Math.max(max, maxManipulation);
            }
        return max;
    }
}