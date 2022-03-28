var twoSum = function(nums, target) {
    let res = [];
    let map = new Map();
    for (let i = 0; i < nums.length; i++) {
        if (map.has(target - nums[i]) && i !== map.get(target-nums[i])) {
            res.push(i);
            res.push(map.get(target-nums[i]));
            return res;
        }
        map.set(nums[i], i);

    }
    return res;
};