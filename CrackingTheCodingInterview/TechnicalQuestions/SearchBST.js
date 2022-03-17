var searchBST = function(root, val) {
    if (!root) return null;
    
    if (root.val == val) return root;
    
    let left = searchBST(root.left, val);
    let right = searchBST(root.right, val);
    
    return left || right;
};