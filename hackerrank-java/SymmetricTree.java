public class SymmetricTree {
    public static void main(String[] args) {
        
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode root1 = root;
        TreeNode root2 = root;
        
        if (root1 == null && root2 == null) {
            return true;
        }
        
        if (root1 == null && root2 != null) {
            return false;
        }
        
        if (root1 != null && root2 == null) {
            return false;
        }
        
        if (root1.val != root2.val) {
            return false;
        }
        
        return isSymmetric(root.right) && isSymmetric(root.left);
    }
}