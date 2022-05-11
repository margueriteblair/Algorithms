function findClosestValueInBst(tree, target) {
    // Write your code here.
      let currDiff = Infinity;
      let currDiffNode = 0;
      
      let q = [tree];
      while (q.length) {
          let curr = q.shift();
          if (Math.abs(curr.value - target) < currDiff) {
              currDiff = Math.abs(curr.value - target);
              currDiffNode = curr.value;
          }
          if (curr.left) q.push(curr.left);
          if (curr.right) q.push(curr.right);
      }
      
      return currDiffNode;
  }
  
  
  // This is the class of the input tree. Do not edit.
  class BST {
    constructor(value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }