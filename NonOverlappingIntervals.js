var eraseOverlapIntervals = function(intervals) {
    //time: O(2^N) space: O(N)
    intervals.sort((a, b) => {return a[0] - b[0]});
    
    var _backtrack = function(prev, curr, intervals) {
        if (curr == intervals.length) {
            return 0;
        }
        
        let taken = Infinity;
        let notTaken;
        
        if (prev == -1 || intervals[prev][1] <= intervals[curr][0]) {
            taken = _backtrack(curr, curr+1, intervals);
        }
        notTaken = _backtrack(prev, curr+1, intervals)+1;
        return Math.min(taken, notTaken);
    }
    
    
    return _backtrack(-1, 0, intervals);
};

var eraseOverlapIntervals = function(intervals) {
    intervals.sort((a, b) => {return a[0] - b[0]}); //sort by starting index
    let dp = new Array(intervals.length);
    if (intervals.length === 0) return 0;
    
    dp[0] = 1; //saying if we just have one element then the max number of valid intervals is 1
    let ans = 1;
    for (let i = 1; i < dp.length; i++) {
        let max = 0;
        for (let j = i-1; j >= 0; j--) {
            if (intervals[j][1] <= intervals[i][0]) {
                max = Math.max(dp[j], max);
            }
        }
        dp[i] = max + 1;
        ans = Math.max(ans, dp[i]);
    }
    return intervals.length - ans;
};

var eraseOverlapIntervals = function(intervals) {
    intervals.sort((a, b) => {return a[0] - b[0]}); //sort by starting index
    let res = 0;
    let prevEnd= intervals[0][1];
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] >= prevEnd) {
            prevEnd = intervals[i][1];
        } else {
            res++;
            prevEnd = Math.min(intervals[i][1], prevEnd);
        }
    }
    return res;
};