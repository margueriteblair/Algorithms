let directions = [[-2, -1], [-2, 1], [2, 1], [2, -1], [-1, 2], [-1, -2], [1, 2], [1, -2]];
var knightProbability = function(n, k, row, column) {
    if (k === 0) return 1.000;
    let seen = new Array(n).fill(0).map(() => new Array(n).fill(0));
    let q = [[row, column]];
    let i = 0;
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
                
                if (newRow >= 0 && newRow < n && newCol >=0 && newCol < n) {
                    canMove++;
                    q.push([newRow, newCol]);
                }
            }
            
            seen[currRow][currCol] = canMove/8;
            
            count++;
        }
        i++;
    }
    console.log(seen)
};