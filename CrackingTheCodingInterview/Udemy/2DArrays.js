//2D array holds other arrays inside
//can be abstracted as a grid


//dfs in 2D arrays
//start at row 0 column 0
//instead of exploring left or right in a binary tree, we can explore up, down, left, right
//up -> right, down, left
//is the zigzag problem just a dfs?
//each node goes up, right, down, left
//lookup should be O(1) time
const directions = [[-1, 0], [0, 1], [1, 0], [0, -1]];
const dfsMatrix = function(matrix) {
    const seen = new Array(matrix.length).fill(0).map(() => new Array(matrix[0].length).fill(false));
    const values = [];
    dfs(matrix, 0, 0, seen, values); //assume dfs will fill the values
    return values;
}

const dfs = function (matrix, row, col, seen, values) {
    if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length || seen[row][col]) {
        return;
    }

    values.push(matrix[row][col]);
    seen[row][col] = true;

    for (let i = 0; i < directions.length; i++) {
        const currentDir = directions[i];
        dfs(matrix, row+currentDir[0], col+currentDir[1], seen, values);
    }
}

//tracking the values O(N) space, time is O(N) b/c we touch every element once