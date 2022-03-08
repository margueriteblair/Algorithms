var sortedArrayToBST = function(nums) {
    return getBST(nums, 0, nums.length-1)
};

const getBST = function(nums, low, high) {
    if (low > high) return null;
    
    let mid = Math.floor((low+high)/2)
    
    let head = new TreeNode(nums[mid]);
    head.left = getBST(nums, low, mid-1)
    head.right = getBST(nums, mid+1, high)
    return head;
}