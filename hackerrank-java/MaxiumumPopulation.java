public class MaxiumumPopulation {
    public static void main(String[] args) {
        
    }

    public int maximumPopulation(int[][] logs) {
        List<Integer> years = new ArrayList<>();
        int year;
        int globalYear = 0;
        int globalPop = 0;
        for (int i = 0; i < logs.length; i++) {
            year = logs[i][0];
            int population = 0;
            for (int j = 0; j < logs.length; j++) {
                if (logs[i][0] <= logs[j][0] && logs[j][1] > logs[i][1]) {
                    population++;
                }
            }
            if (population > globalPop) {
                globalPop = population;
                globalYear = year;
            }
            
        }
        return globalYear;
    }
}