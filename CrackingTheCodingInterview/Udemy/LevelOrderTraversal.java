public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        while (queue.size() != 0) {
            List<Integer> currentLevelValues = new ArrayList<>();
            int count = 0;
            int length = queue.size();
            while (count < length) {
                TreeNode currentNode = queue.remove();
                currentLevelValues.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                count++;
            }
            res.add(currentLevelValues);
        }
        return res;
    }
}

