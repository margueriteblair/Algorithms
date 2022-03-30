var merge = function(nums1, m, nums2, n) {
    for (let i = m+n-1; i >= m; i--) {
        nums1[i] = nums2.pop();
    }
    
    return nums1.sort((a, b) =>{return a-b})
};