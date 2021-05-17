public class ClonedTree {
    public static void main(String[] args) {
        
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned.equals(target)) {
            return cloned;
        }
        if (cloned.left != null) {
            return getTargetCopy(original.left, cloned.left, target);
        }
        
        if (cloned.right != null) {
            return getTargetCopy(original.right, cloned.right, target);
        }
        
        return cloned;
        
    }
}