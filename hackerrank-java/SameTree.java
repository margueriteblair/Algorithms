public class SameTree {
    public static void main(String[] args) {
        
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null && q != null) {
            return false;
        } else if (p != null && q == null) {
            return false;
        } else {
            if (p.val == q.val) {
                if (isSameTree(p.right, q.right) == true && isSameTree(p.left, q.left)) {
                    return true;
                }
            } 
            return false;
        }
        
    }
}