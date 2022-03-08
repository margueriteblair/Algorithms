public TreeNode sortedArrayToBST(int[] nums) {
    //don't modify or slice the array
    //the array is sorted, we can assume it to be the result of an in order traversal of the tree
    //the mid value would represent the root of the binary tree
    //COULD THIS BE A DIVIDE AND CONQUER
    
    
    return getBST(nums, 0, nums.length-1);
}

public TreeNode getBST(int[] nums, int low, int high) {
    if (low > high) return null;
    int mid = low + (high - low) / 2;
    
    TreeNode head = new TreeNode(nums[mid]);
    head.left = getBST(nums, low, mid-1);
    head.right = getBST(nums, mid+1, high);
    return head;
}