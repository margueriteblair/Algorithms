/**
 * @param {character[][]} grid
 * @return {number}
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