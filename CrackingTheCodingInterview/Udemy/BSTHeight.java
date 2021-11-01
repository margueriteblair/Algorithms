public class BSTHeight {
    public int maxDepth(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        
        int heightL = 1;
        int heightR = 1;
        
        if (root.left != null) {
            heightL = maxDepth(root.left)+1;
        }
        
        if (root.right != null) {
            heightR = maxDepth(root.right)+1;
        }
        
        return Math.max(heightR, heightL);
    }
}