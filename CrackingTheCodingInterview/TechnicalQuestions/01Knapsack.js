function solution(c, values, weights) {
    if (c === 0) return 0;
    //each item has a limit of 1
    //our changing params are the capacity we're at presently, and the items we're including
    //compute the max value subset of values such that sum of the weights of this subset doesn't exceed c
    //table: rows will be values/weights, cols will be capacities
    let dp = [];
    for (let i = 0; i <= values.length; i++) {
        const row = new Array(c+1).fill(0);
        dp.push(row);
    }
    
    
    for (let i = 0; i <= values.length; i++) {
        for (let j = 0; j <= c; j++) {
            if (i == 0 || j == 0) {
                dp[i][j] = 0;
                continue;
            }
            
            if (j - weights[i-1] >= 0) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weights[i-1]] + values[i-1]);
            } else {
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    
    return dp[values.length][c];
}