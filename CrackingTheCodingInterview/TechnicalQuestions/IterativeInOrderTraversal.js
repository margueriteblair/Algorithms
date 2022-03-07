var inorderTraversal = function(root) {
    //iterative approach
    let res = [];
    if (!root) return res;
    let stack = [];
    while (true) {
        if (root) {
            stack.push(root);
            root = root.left;
        } else {
            if (stack.length === 0) break;
            root = stack.pop();
            res.push(root.val);
            root = root.right;
        }
    }
    return res;
};