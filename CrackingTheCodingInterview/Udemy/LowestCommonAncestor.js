var lowestCommonAncestor = function(root, p, q) {
    if (!root) return null;
    if (root == p || root == q) return root;
    
    let left = lowestCommonAncestor(root.left, p, q);
    let right = lowestCommonAncestor(root.right, p, q);
    
    if (left && right) return root;
    
    return left != null ? left : right;
};

var lowestCommonAncestorBST = function(root, p, q) {
    if (!root) return null;
    if (root.val > p.val && root.val > q.val) {
        return lowestCommonAncestor(root.left, p, q)
    }
    
    if (root.val < p.val && root.val < q.val) {
        return lowestCommonAncestor(root.right, p, q);
    }
    
    return root;
};