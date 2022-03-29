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

var canJump3 = function(nums) {
    let memo = new Array(nums.length).fill("UNKNOWN");
    var _backtrack = function(pos, nums) {
        if (memo[pos] !== "UNKNOWN") {
            return memo[pos] === "GOOD" ? true : false;
        }
        
        let furthestJump = Math.min(pos + nums[pos], nums.length-1);
        for (let nextPosition = pos+1; nextPosition <= furthestJump; nextPosition++) {
            if (_backtrack(nextPosition, nums)) {
                memo[nextPosition] = "GOOD";
                return true;
            }
        }
        memo[pos] = "BAD";
        return false;
    }
    
    memo[memo.length-1] = "GOOD"; //we have to fill this facebook
    return _backtrack(0, nums);
};