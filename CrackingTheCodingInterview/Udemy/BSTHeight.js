/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxDepth = function(root) {
    if (root == null) {
        return 0;
    }
    let l = 1;
    let r = 1;
    
    if (root.left !== null) {
        l = maxDepth(root.left)+1;
    }
    if(root.right !== null) {
        r = maxDepth(root.right)+1;
    }
    
    return l > r ? l : r;
};
//max height using BFS
var maxDepth = function(root) {
    let depth = 0;
    if (!root) return 0;
    let queue = [root];
    while (queue.length) {
        let count = 0;
        let length = queue.length;
        while (count < length) {
            let curr = queue.shift();
            if (curr.left) queue.push(curr.left);
            if (curr.right) queue.push(curr.right);
            count++;
        }
        depth++;
    }
    return depth;
};