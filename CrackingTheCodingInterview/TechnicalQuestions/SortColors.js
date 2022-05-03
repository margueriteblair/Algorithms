var sortColors = function(nums) {
    let map = new Map();
    map.set(0, 0);
    map.set(1, 0);
    map.set(2, 0);
    for (const num of nums) {
        map.set(num, map.get(num)+1);
    }
    
    let i = 0;
    for (const [key, val] of map) {
        let count = val;
        while (count > 0) {
            nums[i] = key;
            i++;
            count--;
        }
    }
    return nums;
};