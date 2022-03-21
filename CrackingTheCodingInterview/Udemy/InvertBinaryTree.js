function invertBinaryTree(tree) {
    // Write your code here.
      if (!tree) return null;
      let tmp = tree.left;
      tree.left = tree.right;
      tree.right = tmp;
      
      invertBinaryTree(tree.left)
      invertBinaryTree(tree.right)
      
      return tree;
  }