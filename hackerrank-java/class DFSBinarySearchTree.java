class DFSBinarySearchTree {
    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        int depth = 0;
        
        helper(root, map, depth);
        
        // find max
        int maxDepth = Integer.MIN_VALUE;
        
        for (int key : map.keySet()) {
            if (key > maxDepth) maxDepth = key;
        }
        
        return map.get(maxDepth);
    }
    
    private void helper(TreeNode root, Map<Integer, Integer> map, int d) {
        if (root != null) {
            // check if this is a leave
            if (root.left == null && root.right == null) {
                // save the value
                if (map.containsKey(d)) {
                    map.put(d, map.get(d) + root.val);
                } else {
                    map.put(d, root.val);
                }
            }
            // keep going through the tree
            helper(root.left, map, d + 1);
            helper(root.right, map, d + 1);
        }
    }
}