function validateBst(tree) {
    // Write your code here.
      return isValid(tree, -Infinity, Infinity);
  }
  
  const isValid = function(root, min, max) {
      if (!root) return true;
      
      if (root.value < min || root.value >= max){
          return false;
      }
      
      return (isValid(root.left, min, root.value) && isValid(root.right, root.value, max));
  }