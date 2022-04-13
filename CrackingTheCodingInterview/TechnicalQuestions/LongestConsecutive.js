var longestConsecutive = function(nums) {
    let set = new Set();
    let longest = 0;
    for (const num of nums) {
        set.add(num);
    }
    
    for (const num of set) {
        if (!set.has(num-1)) {
            let curr = num;
            let currLongest = 1;
            while (set.has(curr+1)) {
                currLongest++;
                curr = curr+1;
            }
            longest = Math.max(longest, currLongest);
        }
    }
    return longest;
};

var longestConsecutive2 = function(nums) {
    if (nums.length === 0) return 0;
    nums.sort((a, b) => {
        return a-b;
    });
    let globalLongest = 1;
    let longest = 1;
    for (let i = 1; i < nums.length; i++) {
        console.log(nums[i])
        if (nums[i-1]+1 == nums[i]) {
            longest++;
        } else if (nums[i-1]+1 < nums[i]) {
            longest = 1;
        }
        globalLongest = Math.max(longest, globalLongest);
    }
    return globalLongest;
};