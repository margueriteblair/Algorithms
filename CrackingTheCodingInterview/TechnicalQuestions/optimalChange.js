function optimalChangeDP(coins, target) {
    const table = Array(target+1); //array and we pass in the size
    for (let t = 1; t <= target; t++) {
        //iterate over the table
        let min = Infinity;
        for (let c = 0; c < coins.length; i++) {
            if (coins[c] === t) { //t is now acting as the current target
                min = 1;
            }else if (coins[c] < t) {
                min = Math.min(min, table[t-coins[c]])
            }
        }
        table[t] = min + 1;
    }
    //return statement always the same in DP, return the data structure at the index
    return table[target];
}