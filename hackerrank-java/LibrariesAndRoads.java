public class LibrariesAndRoads {
    public static void main(String[] args) {
        
    }

    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        long minCost = 0;
        if (c_lib <= c_road) {
            minCost = n * c_lib;
            return minCost;
        }
        HashMap<Integer, ArrayList<Integer>> cityMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(i);
            cityMap.put(i, list);
        }
        for (int a1 = 0; a1 < cities.length; a1++) {
            int x = cities[a1][0];
            int y = cities[a1][1];
            ArrayList<Integer> list1 = cityMap.get(x);
            ArrayList<Integer> list2 = cityMap.get(y);
            if (list1 != list2) {
                list1.addAll(list2);
                list2.forEach(i -> cityMap.put(i, list1));
            }
        }
            long cost = 0;
            for (ArrayList<Integer> list : cityMap.values()) {
                int size = list.size();
                if (size > 0) {
                    cost += c_lib;
                    cost += (size - 1) * c_road;
                    list.removeIf(i -> true);
                }
            }
            return cost;
    }
}