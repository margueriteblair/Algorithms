var shortestPathBinaryMatrix = function(grid) {
    let directions = [[-1,-1], [-1, 0], [-1, 1], [0, -1], [0, 1], [1,1], [1,0], [1,-1], [0, -1]];
    if (grid.length === 0) return -1; //false condition
    if (grid[0][0] != 0 || grid[grid.length-1][grid[0].length-1] !== 0) return -1;
    let q = [[0,0]];
    //only unvisited cells will have a 0 in them
    //we'll mark the cells with a 1
    grid[0][0] = 1;
    while (q.length) {
        let currCell = q.shift();
        //we will actually overwrite values with the current distance
        let currRow = currCell[0]
        let currCol = currCell[1];
        let distance = grid[currRow][currCol];
        if (currRow === grid.length - 1 && currCol === grid[0].length-1) return distance;
        //we will only write number into cells that currently have a 0 in them
        //then iterate over the directions lists and use each offset to calculate a neighbor row and column
        //we need to start by checking that each row and column is within bounds
        //we can define a function called getNeighbors that takes in a row or column
        for (const dir of directions) {
            let neighborRow = currRow + dir[0]
            let neighborCol = currCol + dir[1]
            if (neighborRow < 0 || neighborCol < 0 || neighborCol >= grid[0].length || neighborRow >= grid.length || grid[neighborRow][neighborCol] !== 0) {
                continue;
            }
            q.push([neighborRow, neighborCol])
            grid[neighborRow][neighborCol] = distance+1; //proactively keeping track 
        }
    }
    return -1;
};