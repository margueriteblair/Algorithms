var subarraySum = function(nums, k) {
    let totalCount = 0;
    let map = new Map();
    map.set(0, 1);
    //[1,2,3] k = 3
    //   i 
    //map = {-2: 1, 0: 1}
    //runningSum = 3;
    let runningSum = 0;
    for (let i = 0; i < nums.length; i++) {
        runningSum += nums[i]
        if (map.has(runningSum - k)) {
            totalCount += map.get(runningSum - k);
        } else {
            map.set(runningSum - k, map.get(runningSum - k) + 1 || 1);
        }
    }
    return totalCount;
};