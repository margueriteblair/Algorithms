/**
 * @param {character[][]} grid
 * @return {number}
 * DFS and BFS is a bit faster for space complexity
 * BFS isn't always space efficient
 * Time complexity: nested for loop for sequential search takes O(M x N) time
 *                  Within our sequential search, we'll be doing a BFS which is also O(N)
 *
 * Space complexity:  Space complexity will be determined by the size of the queue
 *                     The BFS will only happen when we encounter a 1.
 *                     Every time you remove a value, you can only add one more value
 *                     Space: O(max(n, m)) either the row or column value is greater
 * 
 * DFS as a solution:
 *      time: O(M x N)
 *      space: either call stack or regular stack. worst case you could end up holding the entire grid, so O(m x n)
 * 
 */
var numIslands = function(grid) {
    if (!grid.length) return 0;
    let islandCount = 0;
    const directions = [[-1, 0], [0, 1], [1, 0], [0, -1]];
    for (let row = 0; row < grid.length; row++) {
        for (let col = 0; col < grid[0].length; col++) {
            //our sequential search here is o(n)
            if (grid[row][col] == 1) {
                islandCount++;
                grid[row][col] = '0';
                let queue = [[parseInt(row), parseInt(col)]];
                while (queue.length) {
                    let currPos = queue.shift();
                    let currRow = currPos[0];
                    let currCol = currPos[1];
  
                    for (let i = 0; i < directions.length; i++) {
                        let currentDir = directions[i];
                        let nextRow = currRow + currentDir[0];
                        let nextCol = currCol + currentDir[1];
                        if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length) {
                            continue;
                        }
                        
                        if (grid[nextRow][nextCol] == 1) {
                            queue.push([nextRow, nextCol]);
                            grid[nextRow][nextCol] = '0';
                        }
                    }
                }
            }
        }
    }
    return islandCount;
}

//dfs:
//sequential order
//time O(NM)
//space: takes more recursive space in the call stack
    //o(NM) space, the bfs solution slightly more efficient

/*
Vinh's Python Code:
def numberOfIslands(grid):
    if len(grid) == 0:
        return 0
    
    rows, cols = len(grid), len(grid[0])
    num_islands = 0
    
    def bfs(r, c):
        directions = [[-1, 0], [1, 0], [0,1], [0,-1]]
        queue = []
        queue.append((r,c))
        
        while queue:
            curr = queue.pop(0)
            currRow = curr[0]
            currCol = curr[1]
            
            for dr, dc in directions:
                nextR = currRow + dr
                nextC = currCol + dc
                
                if (nextR in range(rows)) \
                    and (nextC in range(cols)) \
                    and (grid[nextR][nextC] == "1"):
                    queue.append((nextR, nextC))
                    grid[nextR][nextC] = "0"
    
    for r in range(rows):
        for c in range(cols):
            if grid[r][c] == "1":
                bfs(r, c)
                num_islands += 1
    
    return num_islands


*/