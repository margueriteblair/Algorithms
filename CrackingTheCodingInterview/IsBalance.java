package CrackingTheCodingInterview;

public class IsBalance {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        System.out.println(getMinHeight(root));
        return getMaxHeight(root) - getMinHeight(root) > 1 ? false : true;
    }
    
    public int getMaxHeight(TreeNode node) {
        if (node == null) return 0;
        int left = 0, right = 0;
        
        left = 1 + getMaxHeight(node.left);
        right = 1 + getMaxHeight(node.right);
        
        return Math.max(left, right);
    }
    
    public int getMinHeight(TreeNode node) {
        if (node == null) return 0;
        int left = 1, right = 1;
        
        left = 1 + getMinHeight(node.left);
        right = 1 + getMinHeight(node.right);
        
        return Math.min(left, right);
    }
}