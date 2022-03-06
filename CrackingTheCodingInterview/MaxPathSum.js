function maxPathSum(tree) {
    // Write your code here.
      const [_, maxSum] = findMaxSum(tree);
      return maxSum
  }
  
  function findMaxSum(tree) {
      //recursive
      if (tree === null) {
          return [0, -Infinity];
      }
      
      //then computer lsb, ls, and rsb, rs
      //our two recursive calls
      let [leftSumBranch, leftMaxPathSum] = findMaxSum(tree.left)
      let [rightSumBranch, rightMaxPathSum] = findMaxSum(tree.right)
      let maxChildSumAsBranch = Math.max(leftSumBranch, rightSumBranch)
      
      let {value} = tree;
      let maxSumAsBranch = Math.max(maxChildSumAsBranch + value, value);
      let maxSumAsTriangle = Math.max(leftSumBranch + value + rightSumBranch, maxSumAsBranch)
      let maxPathSum = Math.max(leftMaxPathSum,rightMaxPathSum, maxSumAsTriangle); 
      //could be a triangle, or the root branch
      return [maxSumAsBranch, maxPathSum];
  }