public class SymmetricTree {
    public static void main(String[] args) {
        
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode leftTree, TreeNode rightTree) {
        if(leftTree == null && rightTree == null) return true;
        if(leftTree == null || rightTree == null) return false;
        return (leftTree.val == rightTree.val &&
                isMirror(leftTree.left, rightTree.right) &&
                isMirror(leftTree.right, rightTree.left));
    }
}