var firstMissingPositive = function(nums) {
    let map = new Map();
    let max = 1;
    for (const num of nums) {
        if (num > 0) {
            map.set(num, false);
            max = Math.max(max, num);
        }
        
    }
    for (let i = 1; i <= max+1; i++) {
        if (!map.has(i)) {
            return i;
        }
    }
    return 0;
};