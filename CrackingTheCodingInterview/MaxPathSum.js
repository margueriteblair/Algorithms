function maxPathSum(tree) {
    // Write your code here.
      let branch, maxSum = [...findMaxSum(tree)];
      return maxSum
  }
  
  function findMaxSum(tree) {
      //recursive
      if (!tree) {
          return [0, 0];
      }
      
      //then computer lsb, ls, and rsb, rs
      //our two recursive calls
      let leftSumBranch, leftMaxPathSum = findMaxSum(tree.left)
      let rightSumBranch, rightMaxPathSum = findMaxSum(tree.right)
      let maxChildSumAsBranch = Math.max(leftSumBranch, rightSumBranch)
      let value = tree.value;
      let maxSumAsBranch = Math.max(maxChildSumAsBranch + value, value);
      let maxSumAsTriangle = Math.max(leftSumBranch + value + rightSumBranch, maxSumAsBranch)
      let maxPathSum = Math.max(leftMaxPathSum,rightMaxPathSum, maxSumAsTriangle); //could be a triangle, or the root branch
      return [maxSumAsBranch, maxPathSum];
  }