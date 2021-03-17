public class MinimumBSTHeight {
    public int minDepth(TreeNode root) {

        int heightL = 1;
        int heightR = 1;
  
        if (root.left != null) {
            heightL = 1 + minDepth(root.left);
        }
        if (root.right != null) {
            heightR = 1 + minDepth(root.right);
        }
        return heightR < heightL ? heightR : heightL;
      }
    
}