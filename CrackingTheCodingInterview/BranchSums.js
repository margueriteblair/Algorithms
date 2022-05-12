class BinaryTree {
    constructor(value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  
  function branchSums(root) {
    // Write your code here.
      let res = [];
      currSum = 0;
      dfs(root, res, currSum)
      return res;
  }
  
  function dfs(node, res, currSum) {
      if (node !== null) {
          currSum += node.value;
          dfs(node.left, res, currSum);
          dfs(node.right, res, currSum);
      } else {
          res.push(currSum);
      }
  }