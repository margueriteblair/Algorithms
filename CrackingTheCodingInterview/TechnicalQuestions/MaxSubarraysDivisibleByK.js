var subarraysDivByK = function(nums, k) {
    let count = 0;
    for (let i = 0; i < nums.length; i++) {
        let currSum = 0;
        for (let j = i; j < nums.length; j++) {
            currSum += nums[j];
            if (currSum % k === 0) count++;
        }
    }
    return count;
};