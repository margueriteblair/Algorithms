var findMin = function(nums) {
    if (nums.length === 1) {
        return nums[0];
    }
    return binarySearch(nums, 0, nums.length-1);
};

var binarySearch = function(nums, left, right) {
    let runningMin = Infinity;
    let leftMin = Infinity;
    let rightMin = Infinity;
    while (left <= right) {
        let mid = Math.floor((left+right)/2);
        if (nums[left] <= nums[mid] && nums[mid+1] <= nums[right]) {
            //we know this is sorted partition
            leftMin = Math.min(leftMin, nums[left])
            rightMin = Math.min(rightMin, nums[mid+1])
            runningMin = Math.min(leftMin, rightMin);
            return runningMin;
        }
        if (nums[left] <= nums[mid] && nums[right] < nums[mid+1]) {
            leftMin = Math.min(nums[left], leftMin);
            left = mid;
        }
        
        if (nums[left] > nums[mid] && nums[right] >= nums[mid+1]) {
            rightMin = Math.min(nums[mid+1], rightMin);
            right = mid;
        }
        
    }
    runningMin = Math.min(rightMin, leftMin);
    return runningMin;
}

var findMin = function(nums) {
    return binarySearch(nums, 0, nums.length-1);
};

var binarySearch = function(nums, low, high) {
    if (high === low) {
        return nums[low]
    }
    let mid = Math.floor((low + high)/2);
    if (nums[mid] < nums[high]) {
        high = mid
    } else {
        low = mid+1;
    }
    return binarySearch(nums, low, high)
}