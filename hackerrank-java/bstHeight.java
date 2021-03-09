public class BSTHeight {
    public static void main(String[] args) {
        
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = 1;
        int rightHeight = 1;
        
        if (root.left != null) {
            leftHeight = 1 + maxDepth(root.left);
        }
        
        if (root.right != null) {
            rightHeight = 1 + maxDepth(root.right);
        }
        
        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }
}