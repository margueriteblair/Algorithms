var getMinimumDifference = function(root) {
    if (!root) {
        return 0;
    }
    if (!root.left && !root.right) {
        return 1;
    }
    
    let res = [];
    dfs(root, res);
    let minDiff = Infinity;
    for (let i =0 ; i < res.length-1; i++) {
        minDiff = Math.min(minDiff, res[i+1] - res[i]);
    }
    
    return minDiff;
};

var dfs = function(root, res) {
    if (root) {
        dfs(root.left, res);
        res.push(root.val)
        dfs(root.right, res);
    }
}