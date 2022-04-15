var pathSum = function(root, targetSum) {
    let res = [];
    let pathNodes = [];
    recurseTree(root, targetSum, pathNodes, res);
    return res;
    
};

var recurseTree = function(node, remainingSum, pathNodes, pathsList) {
    if (!node) return;
    
    pathNodes.push(node.val);
    if (remainingSum === node.val && node.left === null && !node.right) {
        pathsList.push([...pathNodes]);
    } else {
        //otherwise, we recurse on the left and right children
        recurseTree(node.left, remainingSum - node.val, pathNodes, pathsList);
        recurseTree(node.right, remainingSum - node.val, pathNodes, pathsList);
        
        //then we need to pop the node once we are done processing all of its subtrees
    }
    pathNodes.pop(); 
}