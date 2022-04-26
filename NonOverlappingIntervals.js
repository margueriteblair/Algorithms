var eraseOverlapIntervals = function(intervals) {
    let numToDelete = 0;
    intervals.sort((a, b) => {return a[0] - b[0]});
    console.log(intervals);
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i-1][0] === intervals[i][0]) {
            numToDelete++;
        } else if (intervals[i-1][1] > intervals[i][0]) {
            numToDelete++;
        }
    }
    return numToDelete
};