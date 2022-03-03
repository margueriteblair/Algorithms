var threeSum = function(nums) {
    nums.sort((a, b) => {
        return a-b;
    });
    let triplets = []; //will be a nested array;
    for (let i= 0; i < nums.length-2; i++) {
        if (i > 0 && nums[i] === nums[i - 1]) continue;
        let left = i+1;
        let right = nums.length-1;
        while (left < right) {
            let currSum = nums[i] + nums[left] + nums[right];
            if (currSum === 0) {
                triplets.push([nums[i], nums[left], nums[right]]);
                while (nums[left] === nums[left+1]) left++;
                while (nums[right] === nums[right+1]) right--;
                left++;
                right--;
            } else if (currSum < 0) {
                left++;
            } else if (currSum > 0) {
                right--;
            }
        }
    }
    return triplets;  
};