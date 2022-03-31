var permute = function(nums) {
    let res = [];
    const backtrack = (arr2) => {
        if (arr2.length === nums.length) {
            res.push(arr2);
            return;
        }
        
        for (let elem of nums){
            if (!arr2.includes(elem)) {
                backtrack([...arr2, elem])
            }
        }
    }
    backtrack([]);
    return res;
};


var permute2 = function(nums) {
    let res = [];
    
    const backtrack = (nums, tmp, res) => {
        if (tmp.length === nums.length) {
            res.push([...tmp]);
        }
        
        for (let i = 0; i < nums.length; i++) {
            if (tmp.includes(nums[i])) continue;
            tmp.push(nums[i]);
            backtrack(nums, tmp, res);
            tmp.pop();
        }
    }
    
    backtrack(nums,[], res);
    return res;
};