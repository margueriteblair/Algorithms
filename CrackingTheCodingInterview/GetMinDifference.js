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


var getMinimumDifference2 = function(node) {
    let absMin = Infinity;

  const _dfs = (node, min, max, parent) => {
    if(!node) return;

    const parentDiff = Math.abs(parent - node.val);
    const diffWithMin = Math.abs(min - node.val);
    const diffWithMax = Math.abs(max - node.val);
    absMin = Math.min(absMin, parentDiff, diffWithMin, diffWithMax);

    _dfs(node.left, min, node.val, node.val);
    _dfs(node.right, node.val, max, node.val);
  };

  _dfs(node, -Infinity, Infinity, Infinity);

  return absMin === Infinity ? 0: absMin;
};