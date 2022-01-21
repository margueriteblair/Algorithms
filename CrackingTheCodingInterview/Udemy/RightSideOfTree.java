import java.util.LinkedList;

public class RightSideOfTree {
    public static void main(String[] args) {
        rightSideView(new LinkedList<>(1,2,3,null,5,null,4));
    }
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() != 0) {
            int count = 0;
            int len = q.size();
            TreeNode currNode = new TreeNode();
            while (count < len) {
                currNode = q.remove();
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
                count++;
            }
            res.add(currNode.val);
        }
        return res;
    }
}