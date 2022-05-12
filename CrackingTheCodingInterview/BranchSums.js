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
      dfs(root, res, 0)
      return res;
  }
  
  function dfs(node, res, currSum) {
      if (!node) return;
      const newSum = currSum + node.value;
      if (!node.left && !node.right) {
          res.push(newSum);
          return;
      }
      
      dfs(node.left, res, newSum)
      dfs(node.right, res, newSum)
  }