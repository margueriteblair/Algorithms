public class SameTree {
    public static void main(String[] args) {
        
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        while (p != null & q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.right;
            q = q.right;
        }
        
        while (p != null & q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.left;
            q = q.left;
        }
        return true;
    }
}