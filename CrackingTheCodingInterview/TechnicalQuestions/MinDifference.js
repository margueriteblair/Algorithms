function findMinDiff(minutes) {
    for (let i = 0; i < minutes.length; i++) {
      let arr = minutes[i].split(":");
      let hours = +arr[0]*60;
      let mins = +arr[1]
      minutes[i] = hours + mins;
    }
  
    minutes.sort((a, b) => { return a - b });
    //o(nlogn)
    let i = 0;
    let j = 1;
    let runningMin = Infinity;
    while (j < minutes.length) {
      if (minutes[j] - minutes[i] < runningMin) runningMin = minutes[j] - minutes[i];
      i++;
      j++;
    }
    let midnight = 1440;
    let overlapDifference = midnight - minutes[minutes.length-1] + minutes[0];
    if (overlapDifference < runningMin) runningMin = overlapDifference;
  
    return runningMin;
  }

  var findMinDifference = function(timePoints) {
    let buckets = new Array(1440).fill(false);
    for (let i = 0; i < timePoints.length; i++) {
        let arr = timePoints[i].split(":");
        let mins = +arr[0]*60 + +arr[1]
        if (buckets[mins]) return 0;
        buckets[mins] = true;
    }
    
    let min = Infinity;
    let first = -1;
    let prev = -1;
    for (let i = 0; i < buckets.length; i++) {
        if (buckets[i]) {
            if (first == -1){
                first = i;
                prev = i;
            } else{
                min = Math.min(min, i - prev);
                prev = i;
            }
        }
    }
    let outsideMin = 1440 - prev + first;
    min = Math.min(min, outsideMin);
    return min;
};