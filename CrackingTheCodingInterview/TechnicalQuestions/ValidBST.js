var isValidBST = function(root) {
    return isValid(root, Number.NEGATIVE_INFINITY, Number.POSITIVE_INFINITY);
};

const isValid = function(node, min, max) {
    if (!node) return true;
    if (node.val >= max || node.val <= min) {
        return false;
    }
    
    return (isValid(node.left, min, node.val) && isValid(node.right, node.val, max));
}