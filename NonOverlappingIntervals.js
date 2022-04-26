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