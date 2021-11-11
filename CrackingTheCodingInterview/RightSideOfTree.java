public class RightSideOfTree {
    public static void main(String[] args) {
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
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
            res.add(currentLevelValues.remove(currentLevelValues.size()-1));
        }
        return res;
    }
}