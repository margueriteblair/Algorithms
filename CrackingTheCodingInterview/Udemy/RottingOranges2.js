var orangesRotting = function(grid) {
   
    let directions = [[-1, 0], [0, 1], [1, 0], [0, -1]]
    let minutes = -1;
    let queue = [];
    let ones = 0;
    //get a queue with all the rotten orange coordinates
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] === 2) {
                queue.push([i, j])
            } else if (grid[i][j] === 1) {
                ones++;
            }
        }
    }
    if (ones === 0) return 0;
    //now start bfs through the queue
    while (queue.length) {
        let len = queue.length;
        let count = 0;
        while (count < len) {
            let curr = queue.shift();
            let currRow = curr[0]
            let currCol = curr[1]
            for (const dir of directions) {
            let dx = dir[0]
            let dy = dir[1]
            if (currRow + dx < 0 || currRow + dx >= grid.length || currCol + dy < 0 || currCol + dy >= grid[0].length) continue;
            if (grid[currRow+dx][currCol+dy] === 1) {
                ones--;
                grid[currRow+dx][currCol+dy] = 2;
                queue.push([currRow+dx, currCol+dy]);
            }
            }
            count++;
        }
        minutes++;
    }
   
    if (ones > 0) return -1;
    return minutes;
};