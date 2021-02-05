public class LibrariesAndRoads {
    public static void main(String[] args) {
        
    }

    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        long minCost = 0;
        final int[] parent = new int[n + 1];
        final int[] rank = new int[n + 1]; // Union-find subtree rank to merge shorter to larger
        final int[] cityCount = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            parent[i] = i;
            cityCount[i] = 1;
        }
    
        for (final int[] conn : cities) {
            final int v = conn[0];
            final int q = conn[1];
            final int rootV = find(v, parent);
            final int rootQ = find(q, parent);
            if (rootV != rootQ) {
                if (rank[rootV] > rank[rootQ]) {
                    parent[rootQ] = rootV;
                    cityCount[rootV] += cityCount[rootQ];
                } else {
                    parent[rootV] = rootQ;
                    cityCount[rootQ] += cityCount[rootV];
    
                    if (rank[rootV] == rank[rootQ]) {
                        rank[rootQ]++;
                    }
                }
            }
        }
    
        // find all islands (connected sub-graphs) and calculate minimal cost for each cities island
        // consider each "island" as a spanning tree, e.g. it has minimal roads/nodes to connect all of them
        long totalCost = 0;
        for (int i = 1; i < n + 1; i++) {
            if (parent[i] == i) {
                final long roadsCount = cityCount[i] - 1; // number of edges in spanning sub-tree of a graph with cityCount[i] nodes
                final long buildRoadsAndOneLib = roadsCount * c_road + c_lib;
                final int buildLibsInEachCity = cityCount[i] * c_lib;
                totalCost += Math.min(buildRoadsAndOneLib, buildLibsInEachCity);
            }
        }
    
        return totalCost;
    }
    
    // Union find with pass compression
    private static int find(int val, final int[] parents) {
        while (parents[val] != val) {
            parents[val] = parents[parents[val]];
            val = parents[val];
        }
    
        return val;
    }
}