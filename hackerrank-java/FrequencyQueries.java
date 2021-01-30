public class FrequencyQueries {
    public static void main(String[] args) {
        
    }
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> mapQueries = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        
        for (int i = 0; i < queries.size(); i++) {
            int operation = queries.get(i).get(0);
            if (operation == 1) {
                int count = mapQueries.getOrDefault(queries.get(i).get(1), 0)+1;
                mapQueries.put(queries.get(i).get(1), count);
            } else if (operation == 2) {
                if (mapQueries.containsKey(queries.get(i).get(1)) && mapQueries.get(queries.get(i).get(1)) > 0) {
                    int count = mapQueries.getOrDefault(queries.get(i).get(1), 0)-1;
                    mapQueries.put(queries.get(i).get(1), count);
                }
            } else {
                if (mapQueries.containsValue(queries.get(i).get(1))) {
                    output.add(1);
                } else {
                    output.add(0);
                }
            }
        }
        return output;
    }
}