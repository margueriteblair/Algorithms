const directions = [[-1, 0],[0, 1], [1,0], [0, -1]];
const numberOfIslands = function(matrix) {
    if (matrix.length == 0) return 0;
    let islandCount = 0;
    for (let row = 0; row < matrix.length; row++){
        for (let col = 0; col < matrix[0].length; col++) {
            if (matrix[row][col] === 1) {
                islandCount++;
                matrix[row][col] = 0;
                let q = [[row, col]];
                while (q.length) {
                    let curr = q.shift();
                    if (curr[0] < 0 || curr[1] < 0 || curr[1] > matrix[0].length || curr[0] > matrix.length || matrix[curr[0]][curr[1]] == 0) {
                        return;
                    }
                    for (let i = 0; i < directions.length; i++) {
                        const currentDir = directions[i];
                        const nextRow = currentDir[0] + curr[0];
                        const nextColumn = currentDir[1] + curr[1]
                        if (nextRow[0] < 0 || nextColumn < 0 || nextColumn > matrix[0].length || nextRow > matrix.length || matrix[nextRow][nextColumn] == 0) {
                            continue;
                        }

                        if (matrix[nextRow][nextColumn] == 1) {
                            q.push([nextRow, nextColumn])
                            matrix[nextRow][nextColumn] = 0;
                        }
                    }
                }
            }
        }
    }
    return islandCount
}