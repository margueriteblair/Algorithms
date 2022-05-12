function findKthLargestValueInBst(tree, k) {
    let arr = [];
      inOrder(tree, arr);
      return arr[arr.length-k];
  }
  
  function inOrder(node, arr) {
      if (node) {
          inOrder(node.left, arr);
          arr.push(node.value)
          inOrder(node.right, arr);
      }
  }