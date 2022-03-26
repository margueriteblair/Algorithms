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