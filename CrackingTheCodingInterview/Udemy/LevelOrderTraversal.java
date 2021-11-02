public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            res.add(new ArrayList<Integer>());
        }
        int h = maxDepth(root);
        for (int i = 1; i <= h; i++) {
            List<Integer> list = new ArrayList<>();
            res.add(list);
        }
        
        return res;
        
        
    }
    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int heightL = 1;
        int heightR = 1;
        
        if (root.left != null) {
            heightL = maxDepth(root.left)+1;
        }
        if (root.right != null) {
            heightR = maxDepth(root.right)+1;
        }
        
        return Math.max(heightR, heightL);
    }
    
    public void givenLevelNums(TreeNode root, int level, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            list.add(root.val);
        } else if (level > 1) { 
            givenLevelNums(root.left, level-1, list); 
            givenLevelNums(root.right, level-1, list); 
        } 
    }
}