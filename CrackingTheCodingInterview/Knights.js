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

let directions = [[-2, -1], [-2, 1], [2, 1], [2, -1], [-1, 2], [-1, -2], [1, 2], [1, -2]];
var knightProbability = function(n, k, row, col) {
        let dp = new Array(k+1).fill(0).map(() => new Array(n).fill(0)
                                            .map(()=>new Array(n).fill(undefined)));
                                            
        return recurse(n, k, row, col, dp);
};

var recurse = function(n, k, r, c, dp){
    if (r < 0 || c < 0 || r >= n || c >= n) {
        return 0;
    }
    if (k == 0) {
        return 1;
    }
    
    if (dp[k][r][c] !== undefined) {
        return dp[k][r][c];
    }
    let res = 0;
    for (const dir of directions) {
        let x = dir[0]
        let y = dir[1]
        res += recurse(n, k-1, x+r, c +y, dp) / 8;
    }
    dp[k][r][c] =res;
    return dp[k][r][c]
}