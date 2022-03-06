var isValidBST = function(root) {
    return isValid(root, -Infinity, Infinity);
};

const isValid = function(root, min, max) {
    if (!root) return true;
    
    if (root.val <= min || root.val >= max){
        return false;
    }
    
    return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
}