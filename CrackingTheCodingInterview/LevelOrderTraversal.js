const levelOrder = function(root) {
    if (!root) {
        return [];
    }
    let res = [];
    const queue = [root];
    while (queue.length) {
        let length = queue.length;
        let count = 0;
        const currentLevelValues = [];
        while (count < length) {
            const currentNode = queue.shift();
            currentLevelValues.push(currentNode.value);
            if (currentNode.left) {
                queue.push(currentNode.left);
            }
            if (currentNode.right) {
                queue.push(currentNode.right);
            }
            count++;
        }
    }
}