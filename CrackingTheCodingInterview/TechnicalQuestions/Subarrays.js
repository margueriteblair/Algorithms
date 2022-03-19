function numberSubArrays(nums, k) {
    let map = new Map();
    map.set(0, 1); 
    let currSum = 0;
    let count = 0;
    for (const num of nums) {
      currSum += num;
      if (map.has(currSum - k)) {
        count += map.get(currSum - k);
      }
      map.set(currSum, map.get(currSum)+1 || 1);
    }
    return count;
    //track the sums you've seen
    //iterate over array to keep track of curr sum
  }