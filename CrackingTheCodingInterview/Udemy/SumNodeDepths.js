function nodeDepths(root) {
    // Write your code here.
      if (!root) return 0;
      let q = [root];
      let level = 0;
      let sum = 0;
      console.log(root)
      while (q.length) {
          let count = 0;
          let length = q.length;
          while (count < length) {
              let curr = q.shift(); //pop in java's native queue
              if (curr.left) q.push(curr.left)
              if (curr.right) q.push(curr.right);
              sum += level;
              count++
          }
          level++;
      }
      return sum;
  }


  function nodeDepths2(root) {
    // Write your code here.
      return getDepth(root, 0);
  }
  
  function getDepth(root, depth) {
      if (!root) return 0;
      return depth + getDepth(root.left, depth+1) + getDepth(root.right, depth+1);
  }