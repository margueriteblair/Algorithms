public class MaxiumumPopulation {
    public static void main(String[] args) {
        
    }

    public int maximumPopulation(int[][] logs) {
        int[] years = new int[2051];
        for (int[] log : logs) {            
            years[log[0]] += 1;
            years[log[1]] -= 1;
        }
        
        int count = 0;
        int max = Integer.MIN_VALUE;
        int result = -1;
        for (int i = 1950;i<2051;i++) {
            count += years[i];
            if (count > max) {
                max = count;
                result = i;
            }
        }
        return result;
    }
}