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

var maxProfit = function(prices) {
    let currProfits = [0];
    let i = 0, j = 0;
    let maxProfit = 0;
    while (j < prices.length && i < prices.length) {
        maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
        if (prices[i] > prices[j]) i++;
        if (prices[j] >= prices[i]) j++;
    }
    return maxProfit;
};