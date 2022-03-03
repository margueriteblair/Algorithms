var threeSum = function(nums) {
    nums.sort((a, b) => {
        return a-b;
    });
    let triplets = []; //will be a nested array;
    for (let i= 0; i < nums.length-2; i++) {
        let left = i+1;
        let right = nums.length-1;
        while (left < right) {
            let currSum = nums[i] + nums[left] + nums[right];
            if (currSum === 0) {
                triplets.push([nums[i], nums[left], nums[right]]);
                left++;
                right--;
            } else if (currSum < 0) {
                left++;
            } else if (currSum > 0) {
                right--;
            }
        }
    }

    let arr = new Set(triplets.map(x => JSON.stringify(x)));
    let uniques = [...arr].map(x => JSON.parse(x));
    
    return uniques;  
};