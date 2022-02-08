var maxDepth = function(root) {
    if (root == null) return 0;
    let l = 1;
    let r = 1;
    
    if (root.left != null) {
        l = maxDepth(root.left) +1;
    }
    
    if (root.right != null) {
        r = maxDepth(root.right) + 1;
    }
    
    return l > r ? l : r;
};