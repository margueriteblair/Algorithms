let directions = [[-2, -1], [-2, 1], [2, 1], [2, -1], [-1, 2], [-1, -2], [1, 2], [1, -2]];
var knightProbability = function(n, k, row, column) {
    if (k === 0) return 1.000;
    let seen = new Array(n).fill(-1).map(() => new Array(n).fill(-1));
    let q = [[row, column]];
    let i = 0;
    let totalP = 0;
    while (i < k) {
        let count = 0;
        let len = q.length;
        while (count < len) {
            let curr = q.shift();
            let currRow = curr[0]
            let currCol = curr[1];
            
            let canMove = 0;
            for (const dir of directions) {
                let newRow = currRow + dir[0];
                let newCol = currCol + dir[1];
                
                if (newRow >= 0 && newRow < n && newCol >=0 && newCol < n ) {
                    canMove++;
                    q.push([newRow, newCol]);
                }
            }
            
            seen[currRow][currCol] = canMove/8;
            if (i == k-1) {
            totalP += seen[currRow][currCol];
            }
            count++;
        }
        i++;

    }
    //console.log(seen)
    return totalP/8;
};

let directions = [[-2, -1], [-2, 1], [2, 1], [2, -1], [-1, 2], [-1, -2], [1, 2], [1, -2]];
var knightProbabilityRecursive = function(n, k, row, col) {
        if (row < 0 || row >= n || col < 0 || col >= n) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
    
        let res = 0;
        for (const dir of directions) {
            let x = dir[0]
            let y = dir[1]
            res += knightProbabilityRecursive(n, k-1, row+x, col+y) / 8;
        }
        return res;
};