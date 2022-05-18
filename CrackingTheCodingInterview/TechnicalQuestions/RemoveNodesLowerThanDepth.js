function solution(root, depth) {
    if (!root) return null;
    
    let q = [root];
    let currDepth = 0;
    while (q.length) {
        let count = 0;
        let len = q.length;
        while (count < len) {
            let currNode = q.shift();
            if (currDepth === depth) {
                currNode.left = null;
                currNode.right = null;
            }
            if (currNode.left) {
                q.push(currNode.left);
            }
            if (currNode.right) {
                q.push(currNode.right);
            }
            count++;
        }
        currDepth++;
    }
    return root;
    
}