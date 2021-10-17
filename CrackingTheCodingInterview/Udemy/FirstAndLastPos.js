/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let res = []
    let left = 0;
    let right = nums.length-1;
    while (left <= right) {
        let mid = Math.floor((left+right)/2);
        if (nums[mid] === target) {
            left = mid;
            right = mid;
            while (nums[left-1] === target) {
                left--;
            }
            while (nums[right+1] === target) {
                right++;
            }
            res.push(left);
            res.push(right);
        } else if (nums[mid] < target) {
            left = mid+1;
        } else if (nums[mid] > target) {
            right = mid-1;
        }
    }
    return [-1, -1];
};