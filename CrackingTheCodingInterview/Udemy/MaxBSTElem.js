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

function findTreeMax2(root) {
  if (root == null) {
    return null;
  }
  let maxLeft = root.value;
  let maxRight = root.value;
  let max = root.value;
  
  if (root.left != null) {
    maxLeft = findTreeMax2(root.left);
    max = Math.max(maxLeft, max);
  }

  if (root.right != null) {
    maxRight = findTreeMax2(root.right);
    max = Math.max(maxRight, max);
  }
return max;
}