function minHeightBst(array) {
    // Write your code here.
      return buildBST(array, 0, array.length-1);
  }
      
  function buildBST(array, left, right) {
      if (left > right) return null;
      let mid = Math.floor((left+right)/2);
      let head = new BST(array[mid]);
      head.left = buildBST(array, left, mid-1);
      head.right = buildBST(array, mid+1, right);
      return head;
  }