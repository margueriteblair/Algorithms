public class ArrayManipulation {
    public static void main(String[] args) {
        System.out.println(Long.MIN_VALUE);
    }

    static long arrayManipulation(int n, int[][] queries) {
        long[] resultingQueries = new long[n];
        long maxManipulation = 0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                resultingQueries[j-1] += queries[i][2];
                if (resultingQueries[j-1] > maxManipulation) {
                    maxManipulation = resultingQueries[j-1];
                }
            }
        }
        return maxManipulation;
    }

    static long arrayManipulation2(int n, int[][] queries) {
        long[] resultingQueries = new long[n+2];
        long maxManipulation = 0;
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            resultingQueries[a] += k;
            resultingQueries[b+1] -= k;
        }
        long max = 0;
        for (int i = 0; i < resultingQueries.length; i++) {
                maxManipulation += resultingQueries[i];
                max = Math.max(max, maxManipulation);
            }
        return max;
    }
}