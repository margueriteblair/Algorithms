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