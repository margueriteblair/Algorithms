var hasPathSum = function(root, targetSum) {
    return dfs(root,targetSum);
};

function dfs(node, remaining) {
    if (!node) return false;
    
    if (node.val === remaining && !node.left && !node.right) {
        return true;
    }
    
    return (dfs(node.left, remaining-node.val) || dfs(node.right, remaining-node.val));
}