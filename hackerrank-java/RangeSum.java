public class RangeSum {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    int h = 0;
    int l = 0;
    void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        if(root.val <= h && root.val >= l){
            nums.add(root.val);
        }
        preOrder(root.left);
        preOrder(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        h = high;
        l = low;
        preOrder(root);
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }
}