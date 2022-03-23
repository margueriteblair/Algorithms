var subarraySum = function(nums, k) {
    let totalCount = 0;
    let map = new Map();
    map.set(0, 1);
    //[1,1,1] k = 2
    //   i 
    //map = {0: 2, -1: 1, 1:1}
    //runningSum = 3;
    //totalCount = 1
    let runningSum = 0;
    for (let i = 0; i < nums.length; i++) {
        runningSum += nums[i]
        if (map.has(runningSum - k)) totalCount += map.get(runningSum - k);
        map.set(runningSum, map.get(runningSum) + 1 || 1);
    }
    return totalCount;
};