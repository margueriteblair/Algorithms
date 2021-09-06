const findTwoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        const numToFind = target-nums[i];
        for (let j = i+1; j < nums.length; j++) {
            if (numToFind == nums[j]) {
                return [i, j];
            }
        }
    }
    return null
}

const findTwoSum2 = function(nums, target) {
    const numsMap = {}
    for (let i = 0; i < nums.length; i++) {
        let currentMapVal = numsMap[nums[i]]
        if (currentMapVal >= 0) {
            return [currentMapVal, i];
        } else {
            numsMap[target-nums[i]] = i;
        }
    }
    return null;
}

console.log(findTwoSum2([1, 3, 7, 9, 2], 11))
console.log(findTwoSum2([1, 3, 7, 9, 2], 25))