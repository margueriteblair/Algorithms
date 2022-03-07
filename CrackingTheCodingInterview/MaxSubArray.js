var maxSubArray = function(nums) {
    let local = nums[0];
    let global = nums[0];
    for (let i = 0; i < nums.length; i++) {
        local = Math.max(nums[i], nums[i] + local);
        global = Math.max(local, global);
    }
    return global;
};