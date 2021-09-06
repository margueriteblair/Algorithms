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

console.log(findTwoSum([1, 3, 7, 9, 2], 11))
console.log(findTwoSum([1, 3, 7, 9, 2], 25))