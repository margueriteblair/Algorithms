var countNodes = function(root) {
    if (!root) return 0;
    let count = 0;
    let q = [root];
    while (q.length) {
        let curr = q.shift();
        count++;
        if (curr.left) q.push(curr.left);
        if (curr.right) q.push(curr.right);
    }
    return count;
};

var countNodes2 = function(root) {
    if (!root) return 0;
    
    return (1 + countNodes(root.left) + countNodes(root.right));
};