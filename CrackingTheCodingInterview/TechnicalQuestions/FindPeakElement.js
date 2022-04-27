var findPeakElement = function(nums) {
    if (nums.length === 1) return 0;
    if (nums.length === 2) {
        return nums[0] > nums[1] ? 0 : 1;
    }
    return binarySearch(nums, 0, nums.length-1)
};

var binarySearch = function(nums, left, right) {
   
    if (left > right) return -1;
    let mid = Math.floor((left+right)/2);
    if ((nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) || (mid === nums.length-1 && nums[mid] > nums[mid-1]) || (mid === 0 && nums[mid] > nums[mid+1]))
    {
        return mid;
    }
    let leftPartition = binarySearch(nums, left, mid-1);
    let rightPartition = binarySearch(nums, mid+1, right);
    return leftPartition == -1 ? rightPartition : leftPartition;
}