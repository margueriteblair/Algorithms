function findTreeMax(root) {
    // Write your code here.
    if (root == null) return null;
    let max = root.value;
    let q = [root];
    while (q.length != 0) {
      let count = 0;
      let length = q.length;
      while (count < length) {
        let currNode = q.shift();
        if (currNode.value > max) max = currNode.value;
        count++;
        if (currNode.left != null) {
          q.push(currNode.left);
        }
        if (currNode.right != null) {
          q.push(currNode.right);
        }
      }
    }
    return max;
}