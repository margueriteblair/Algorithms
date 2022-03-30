var merge = function(nums1, m, nums2, n) {
    for (let i = m+n-1; i >= m; i--) {
        nums1[i] = nums2.pop();
    }
    
    return nums1.sort((a, b) =>{return a-b})
};

var merge = function(nums1, m, nums2, n) {
    let nums1Copy = [];
    for (let i = 0; i < m; i++) {
        nums1Copy.push(nums1[i])
    }
    
    let p1 = 0;
    let p2 = 0;
    let p = 0;
    
    while (p1 < m && p2 < n) {
        if (nums1Copy[p1] < nums2[p2]) {
            nums1[p] = nums1Copy[p1];
            p1++;
        } else {
            nums1[p] = nums2[p2];
            p2++;
        }
        p++;
    }
    
    while (p1 < m) {
        nums1[p] = nums1Copy[p1];
        p1++;
        p++;
    }
    
    while (p2 < n) {
        nums1[p] = nums2[p2];
        p++;
        p2++;
    }
    return nums1;
};