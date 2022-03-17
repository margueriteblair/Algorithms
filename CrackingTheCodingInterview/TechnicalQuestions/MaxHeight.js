var maxDepth = function(root) {
    if (!root) {
        return 0;
    }
    let left = 0;
    let right = 0;
    
    left = maxDepth(root.left) + 1;
    right = maxDepth(root.right) + 1;
    
    return Math.max(left, right);
};