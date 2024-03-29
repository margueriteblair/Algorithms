var inorderTraversal = function(root) {
    let res = [];
    if (!root) return res;
    let stack = [];
    while (true) {
        while (root) {
            stack.push(root);
            root = root.left;
        }
        if (stack.length === 0) break;
        let curr = stack.pop();
        res.push(curr.val);
        root = curr.right;
    }
    return res;
};

var inorderTraversal2 = function(root) {
    let res = [];
    if (!root) return res;
    let stack = [];
    while (stack.length || root) {
        if (root) {
            stack.push(root);
            root = root.left;
        } else {
            let curr = stack.pop();
            res.push(curr.val);
            root = curr.right;
        }
    }
    return res;
};