var maxProfit = function(prices) {
    let max = 0;
    for (let i = 0; i < prices.length; i++) {
        let runningProfit = 0;
        for (let j = i; j < prices.length; j++) {
            runningProfit = prices[j]- prices[i];
            max = Math.max(max, runningProfit);
        }
    }
    return max;
};