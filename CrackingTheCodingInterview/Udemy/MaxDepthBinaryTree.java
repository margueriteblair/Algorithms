package CrackingTheCodingInterview.Udemy;

public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = 1;
        int r = 1;
        
        if (root.left != null) {
            l = maxDepth(root.left)+1;
        }
        
        if (root.right != null) {
            r = maxDepth(root.right)+1;
        }
        
        return Math.max(l, r);
    }
}