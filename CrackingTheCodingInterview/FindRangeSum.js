var rangeSumBST = function(root, low, high) {
    let res = [];
    dfs(root, res);
    let sum = 0;
    for (let i = 0; i < res.length; i++) {
        if (res[i] >= low && res[i] <= high) {
            sum += res[i]
        }
    }
    return sum;
    
};

var dfs = function(node, arr) {
    if (node) {
        dfs(node.left, arr);
        arr.push(node.val)
        dfs(node.right, arr);
    }
}