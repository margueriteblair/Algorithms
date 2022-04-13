var permuteUnique = function(nums) {
    let res = [];
    const map = new Map();
    for (let num of nums) {
        map.set(num, map.get(num)+1||1);
    }
    var _backtrack = function(curr) {
        
        if (curr.length === nums.length) {
            res.push([...curr]);
            return;
        }
        
        for (const [num, count] of map.entries()) {
            if (count === 0) {
                continue;
            }
            curr.push(num);
            map.set(num, count-1);
            _backtrack(curr, map);
            curr.pop();
            map.set(num, count);
        }
    }
    
    _backtrack([]);
    return res;
};