package CrackingTheCodingInterview;

public class IsBalance {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        return (Math.abs(getMaxHeight(root.left) - getMaxHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right));
    }
    
    public int getMaxHeight(TreeNode node) {
        if (node == null) return 0;
        int left = 0, right = 0;
        
        left = 1 + getMaxHeight(node.left);
        right = 1 + getMaxHeight(node.right);
        
        return Math.max(left, right);
    }
}