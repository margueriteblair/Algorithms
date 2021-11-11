const rightSideView = function(root) {
    if (!root) {
        return [];
    }
    let res = [];
    const queue = [root];
    while (root.length) {
        const currentLevelValues = [];
        let length = queue.length;
        let count = 0;
        while (count < length) {
            const currNode = queue.shift();
            currentLevelValues.push(currNode.val);
            if(currNode.left) {
                queue.push(currNode.left)
            }
              
            if(currNode.right) {
                queue.push(currNode.right)
            }
            count++; 
        }
        res.push(currentLevelValues.pop());
    }
    return res;
}