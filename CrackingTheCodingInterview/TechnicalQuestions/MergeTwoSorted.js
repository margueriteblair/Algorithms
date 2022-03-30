var merge = function(nums1, m, nums2, n) {
    for (let i = nums1.length-1; i >= nums1.length-n; i--) {
        nums1[i] = nums2.pop();
    }
    
    return nums1.sort((a, b) =>{return a-b})
};