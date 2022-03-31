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