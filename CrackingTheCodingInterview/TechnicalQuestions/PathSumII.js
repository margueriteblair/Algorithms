var pathSum = function(root, targetSum) {
    let res = [];
    let pathNodes = [];
    let sumCount = 0;
    dfs(root, targetSum, pathNodes, res, sumCount);
    return res;
};


var dfs = function(node, remainingSum, currPath, pathsList) {
    if (!node) return;
    currPath.push(node.val);
    dfs(node.left, remainingSum - node.val, currPath, pathsList);
    dfs(node.right, remainingSum - node.val, currPath, pathsList);
    if (!node.left && !node.right && node.val === remainingSum) pathsList.push([...currPath]);
    currPath.pop(); 
}