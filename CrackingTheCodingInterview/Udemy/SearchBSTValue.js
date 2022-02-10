function searchBST(root, target) {
    if (!root) {
        return false;
    }
  
    if (target === root.value) {
        return true;
    }

    if (target < root.value && root.left !== null) {
        return searchBST(root.left, target);
    }
    if (target > root.value && root.right !== null) {
        return searchBST(root.right, target);
    }
  
    return false;
}

class Tree {
    constructor(x, left = null, right = null) {
      this.value = x;
      this.left = left;
      this.right = right;
    }
  }