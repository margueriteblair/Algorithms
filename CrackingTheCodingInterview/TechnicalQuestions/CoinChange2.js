var change = function(amount, coins) {
    let dp = new Array(coins.length).fill(0).map(() => new Array(amount+1).fill(0));
    for (let i = 0; i < coins.length; i++) {
        dp[i][0] = 1;
    }
    for (let i = 0; i <= amount; i++) {
        dp[0][i] = amount % coins[0] == 0 ? 1 : 0;
    }
    for (let i = 1; i < coins.length; i++) {
        for (let j =1; j <= amount; j++) {
            if (coins[i] > j) {
                dp[i][j] = dp[i-1][j];
            } else {
                dp[i][j] = dp[i-1][j] + dp[i][j-coins[i]];
            }
        }
    }
    return dp[coins.length-1][amount];
};