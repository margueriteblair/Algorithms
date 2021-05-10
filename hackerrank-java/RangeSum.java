public class RangeSum {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root.left != null) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.right != null) {
            sum += rangeSumBST(root.right, low, high);
        }
        
        return sum;
    }
}