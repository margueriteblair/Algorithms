function findClosestValueInBst(tree, target) {
    // Write your code here.
      if (!tree) return -1;
      
      let q = [tree];
      let diff = Math.abs(tree.value - target);
      console.log(diff);
      let currClosest = tree;
      while (q.length) {
          let curr = q.shift();
          if (Math.abs(curr.value - target) < diff) {
              diff = Math.abs(curr.value - target);
              currClosest = curr;
          }
          if (curr.left) q.push(curr.left);
          if (curr.right) q.push(curr.right);
      }
      return currClosest.value;
  }