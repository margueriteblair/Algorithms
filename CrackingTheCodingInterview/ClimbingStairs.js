var minCostClimbingStairs = function(cost) {
    const n = cost.length;
    return Math.min(minCost(n-1, cost), minCost(n-2, cost));
};

var minCost = function(i, cost) {
    if (i < 0) return 0;
    if (i === 0 || i===1) return cost[i];
    
    return cost[i] + Math.min(minCost(i-1, cost), minCost(i-2, cost));
}

var minCostClimbingStairs = function(cost) {
    const n = cost.length;
    let memo = new Map();
    memo.set(0, cost[0]);
    memo.set(1, cost[1]);
    memo.set(-1, 0); //-1 will cover all negative numbers
    for (let i = 2; i <= n; i++) {
        //console.log(memo);
        memo.set(i, cost[i] + Math.min(memo.get(i-1), memo.get(i-2)));
    }
    
    return Math.min(memo.get(n-1), memo.get(n-2));
};