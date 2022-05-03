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

var sortColors2 = function(nums) {
    let p0 = 0, curr = 0;
    let p2 = nums.length-1;
    
    let tmp;
    
    while (curr <= p2) {
        if (nums[curr] === 0) {
            tmp = nums[p0];
            nums[p0++] = nums[curr];
            nums[curr++] = tmp;
        } else if (nums[curr] === 2) {
            tmp = nums[curr];
            nums[curr] = nums[p2];
            nums[p2--] = tmp;
        } else {
            curr++;
        }
    }
    return nums;
};