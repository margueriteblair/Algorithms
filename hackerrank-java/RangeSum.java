public class RangeSum {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.left != null) {
            return rangeSumBST(root.left, low, high) + sum;
        }
        if (root.right != null) {
            return rangeSumBST(root.right, low, high) + sum;
        }
        
        return sum;
    }
}