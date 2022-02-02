public class OrganizingContainers {
        // Complete the organizingContainers function below.
        static String organizingContainers(int[][] container) {
            List<Integer> rows = new ArrayList<>();
            List<Integer> columns = new ArrayList<>();
            for (int i = 0; i < container.length; i++) {
                int rowSum = 0;
                for (int j = 0; j < container[0].length; j++) {
                    rowSum += container[i][j];
                }
                rows.add(rowSum);
            }
            for (int i = 0; i < container[0].length; i++) {
                int colSum = 0;
                for (int j = 0; j < container.length; j++) {
                    colSum += container[j][i];
                }
                columns.add(colSum);
            }
            Collections.sort(columns);
            Collections.sort(rows);
            return rows.equals(columns) ? "Possible" : "Impossible";
    
        }

        static String organizingContainers2(int[][] container) {
            List<Integer> rows = new ArrayList<>();
            List<Integer> columns = new ArrayList<>();
            for (int i = 0; i < container.length; i++) {
                int rowSum = 0;
                for (int j = 0; j < container[0].length; j++) {
                    rowSum += container[i][j];
                }
                rows.add(rowSum);
            }
            for (int i = 0; i < container[0].length; i++) {
                int colSum = 0;
                for (int j = 0; j < container.length; j++) {
                    colSum += container[j][i];
                }
                columns.add(colSum);
            }
    
            return rows.containsAll(columns) ? "Possible" : "Impossible";
        }
}