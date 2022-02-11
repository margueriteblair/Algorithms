function validateBST(tree) {
    return isValid(tree, Number.NEGATIVE_INFINITY, Number.POSITIVE_INFINITY);
      
  }
  
  function isValid(node, min, max) {
    if (!node) {
      return true;
    }
    if (node.value <= min || node.value >= max) {
      return false;
    }
    return isValid(node.left, Number.NEGATIVE_INFINITY, node.value) && isValid(node.right, node.value, Number.POSITIVE_INFINITY);
  }