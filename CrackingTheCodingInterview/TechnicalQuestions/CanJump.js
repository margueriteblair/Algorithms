var canJump = function(nums) {
    let lastGoodIndex = nums.length-1;
    for (let i = nums.length-1; i >= 0; i--) {
        if (i + nums[i] >= lastGoodIndex) {
            lastGoodIndex = i;
        }
    }
    
    return lastGoodIndex == 0;
};

var canJump2 = function(nums) {
    var _backtrack = function(pos, nums) {
        if (pos === nums.length-1) return true;
        
        let furthestJump = Math.min(pos + nums[pos], nums.length-1);
        for (let nextPosition = pos+1; nextPosition <= furthestJump; nextPosition++) {
            if (_backtrack(nextPosition, nums)) {
                return true;
            }
        }
        return false;
    }
    
    return _backtrack(0, nums);
};