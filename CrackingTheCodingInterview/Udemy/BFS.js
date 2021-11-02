const BFS = function(root) {
    let res = []
    let q = [root];
    while (q.length) {
        //the while loop ensures that while q.length is still truthy
        node = q.shift();
        res.push(node.val);
        if (node.left) {
            q.push(node.left);
        }
        if (node.right) {
            q.push(node.right);
        }
    }
}