public class ClonedTree {
    public static void main(String[] args) {
        
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return getTargetCopy(original, cloned, target, null);
        }
        
    public static final TreeNode getTargetCopy(
                final TreeNode original, final TreeNode cloned, final TreeNode target, TreeNode treeNode) {
            if (original.val == cloned.val && original.val == target.val) {
                return cloned;
            }
            if (null != original.left && null != cloned.left && null == treeNode)
                treeNode = getTargetCopy(original.left, cloned.left, target, treeNode);
            if (null != original.right && null != cloned.right && null == treeNode)
                treeNode = getTargetCopy(original.right, cloned.right, target, treeNode);
            return treeNode;
    }
}