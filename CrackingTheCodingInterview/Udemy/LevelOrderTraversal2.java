public class LevelOrderTraversal2 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (queue.size() != 0) {
            List<Integer> currLevel = new ArrayList<>();
            int count = 0;
            int length = queue.size();

            while (count < length) {
                TreeNode currNode = queue.remove();
                currLevel.add(currNode.val);
                
                if (currNode.left != null) {
                queue.add(currNode.left);
            }
            
                if (currNode.right != null) {
                queue.add(currNode.right);
            }
                
                count++;
            }
            res.add(currLevel);
        }
        return res;
    }
}