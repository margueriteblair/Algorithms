class BinaryTree {
    constructor(value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  
  function heightBalancedBinaryTree(tree) {
    // Write your code here.
      //difference between hight of left subtree and right is at most 1
      
    if (!tree) return true;
      
      return (Math.abs(getHeight(tree.left) - getHeight(tree.right)) < 2 && heightBalancedBinaryTree(tree.left) && heightBalancedBinaryTree(tree.right));
  }
  
  function getHeight(node) {
      if (!node) return 0;
      let left = 0;
      let right = 0;
      
      left = 1 + getHeight(node.left);
      right = 1 + getHeight(node.right);
      
      return Math.max(left, right);
  }