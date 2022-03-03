public class NumIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int islandCount = 0;
        int[][] directions = new int[][] {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    islandCount++;
                    grid[row][col] = '0';
                    Queue<Integer[]> queue = new LinkedList<>();
                    queue.add(new Integer[] {row, col});
                    
                    while (queue.size() != 0) {
                        Integer[] currPos = queue.remove();
                        int currRow = currPos[0];
                        int currCol = currPos[1];
                        
                        for (int i = 0; i < directions.length; i++) {
                            int[] currDirection = directions[i];
                            int nextRow = currRow + currDirection[0];
                            int nextCol = currCol + currDirection[1];
                            if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length) {
                                continue;
                            }
                            
                            if (grid[nextRow][nextCol] == '1') {
                                queue.add(new Integer[] {nextRow, nextCol});
                                grid[nextRow][nextCol] = '0';
                            }
                        }
                    }
                }
            }
        }
        return islandCount;
    }
}