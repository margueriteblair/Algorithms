var isMajorityElement = function(nums, target) {
    let firstOccurrence = binarySearch(nums, 0, nums.length-1, target);
    console.log(firstOccurrence);
    let firstPos = firstOccurrence;
    let lastPos = firstOccurrence;
    let tmp;
    while (firstPos !== -1) {
        tmp = firstPos;
        firstPos = binarySearch(nums, 0, firstPos-1, target);
    }
    firstPos = tmp;
    while(lastPos !== -1) {
        tmp = lastPos;
        lastPos = binarySearch(nums, lastPos+1, nums.length-1, target);
    }
    lastPos = tmp;
    console.log(firstPos, lastPos)
    return (lastPos - firstPos + 1) > (nums.length/2) ? true : false;
};

var binarySearch = function(nums, left, right, target) {
    while (left <= right) {
        let mid = Math.floor((left+right)/2);
        if (nums[mid] === target) return mid;
        if (nums[mid] < target) {
            left = mid+1;
        } else {
            right = mid-1;
        }
    }
    return -1;
}