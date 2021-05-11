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

    private int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root,low,high);
        sum+=low;
        sum+=high;
        return sum;
    }
    public void helper(TreeNode root, int low, int high){
        if(root == null)
            return;
        if(root.val>low && root.val<high)
            sum+=root.val;
        if(low<root.val && high<root.val)
             helper(root.left,low,high);
        else if(low>root.val && high>root.val)
             helper(root.right,low,high);
        else{
            helper(root.left,low,high);
            helper(root.right,low,high);
        }
    }

    List<Integer> list = new ArrayList<>();
    public int rangeSumBST2(TreeNode root, int low, int high) {
        helper(root);
        System.out.println(list);
        int sum = 0;
        for (int i : list) {
            if (i >= low && i <= high) {
                sum += i;
            }
        }
        return sum;
    }
    
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}