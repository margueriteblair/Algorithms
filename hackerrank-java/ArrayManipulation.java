public class ArrayManipulation {
    public static void main(String[] args) {
        
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
}