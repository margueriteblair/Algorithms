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

var subarraysDivByK2 = function(nums, k) {
    const map = new Map();
    map.set(0, 1);
    let count = 0;
    let currSum = 0;
    //[4,5,0,-2,-3,1] k = 5
    //{0: 1, 4: 2, 9: 2, 7: 1, 5: 1}
    for (let i = 0; i < nums.length; i++) {
        currSum += nums[i];
        let rem = currSum % k;
        if (rem < 0) {
            rem += k;
        }
        if (map.has(rem)) {
            count += map.get(rem);
            map.set(rem, map.get(rem)+1);
        } else {
            map.set(rem, 1);
        }
    }
    return count;
};