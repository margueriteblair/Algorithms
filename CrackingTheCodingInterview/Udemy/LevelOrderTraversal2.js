if (root == null) return [];
    let res = [];
    let q = [root];
    while (q.length) {
        let count = 0;
        let len = q.length;
        let currLevel = [];
        while (count < len) {
            let currNode = q.shift();
            currLevel.push(currNode.val);
            count++;
            if (currNode.left != null) {
                q.push(currNode.left);
            }
            if (currNode.right != null) {
                q.push(currNode.right);
            }
        }
        res.push(currLevel);
    }
    return res;