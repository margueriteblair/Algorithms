var minDepth = function(root) {
    if (!root) return 0;
    let left = 0;
    let right = 0;
    
    left = minDepth(root.left) + 1;
    right = minDepth(root.right) + 1;
    
    if (left > 1 &&right > 1) {
        return Math.min(left, right);
    } else if (left <= 1 && right > 1) {
        return right;
    } else{
        return left;
    }

};