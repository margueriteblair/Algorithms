public class ClonedTree {
    public static void main(String[] args) {
        
    }

    public static TreeNode treeNode = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original.val == target.val && original.val == cloned.val) {
            return cloned;
        }
        if (cloned.left != null) {
            treeNode = getTargetCopy(original.left, cloned.left, target);
        }
        
        if (cloned.right != null) {
            treeNode = getTargetCopy(original.right, cloned.right, target);
        }
        
        return treeNode;
        
    }
}