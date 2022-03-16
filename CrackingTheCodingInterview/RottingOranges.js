var orangesRotting = function(grid) {
    if (grid.length === 0) return 0;
    let mins = 0;
    let onesCount = 0;
    let queue = [];
    //step 1: add 2's to a queue
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] === 2) {
                queue.push([i, j]);
            }
        }
    }
    //step 2: bfs the items, adding
    
    const directions = [[-1, 0], [0, 1], [1, 0], [0, -1]];
    while (queue.length) {
        console.log(queue);
        let count = 0;
        let length = queue.length;
        
        while (count < length) {
            let curr = queue.shift();
            
            let currRow = curr[0]
            let currCol = curr[1]
            for (const dir of directions) {
                let nextRow = dir[0] + currRow;
                let nextCol = dir[1] + currCol;
                // console.log(nextRow, nextCol);
                if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length || grid[nextRow][nextCol] != 1) {
                    continue;
                }
                
                if (grid[nextRow][nextCol] === 1) {
                    onesCount++;
                    grid[nextRow][nextCol] = 2;
                    queue.push([nextRow, nextCol]);
                }
            }
            count++;
        }
        mins++;
    }
    
    //step 3: check again for any isolated 1;s
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] === 1) return -1;
        }
    }
    return onesCount == 0 ? 0 : mins-1;
};