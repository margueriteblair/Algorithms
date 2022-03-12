function shiftedBinarySearch(array, target) {
    // Write your code here.
      let left = 0;
      let right = array.length-1;
      //few more comparisons to make
      //O(logn) just with more comparisons
      while (left <= right) {
          let mid = Math.floor((left + right)/2);
          if (target === array[mid]) {
              return mid;
          }
          if (array[left] <= array[mid]) {
              if (target < array[mid]&& target >= array[left]) {
                  //do a binary search in here
                  right = mid - 1;
              } else {
                  left = mid + 1;
              }
          } else { //here's our unsorted portion of the array
              if (target > array[mid] && target <= array[right]) {
                  left = mid + 1;
              } else {
                  right = mid -1;
              }
          }
      }
      return -1;
  }

  var search = function(nums, target) {
    let left = 0;
    let right = nums.length-1;
    
    while (left <= right) {
        let mid = Math.floor((left+right)/2);
        console.log(left, right);
        if (nums[mid] === target) return mid;
        //***WE CAN EITHER HAVE THE LEFT AND RIGHT INDEX CHECKS ORRRR WE CAN SAY NUMS[LEFT] <= NUMS[MID] */
        // if (nums[left] === target) return left;
        // if (nums[right] === target) return right;
        if (nums[left] <= nums[mid]) {
            //this part is sorted
            if (nums[left] <= target && target < nums[mid]) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        } else {
            if (nums[mid] < target && nums[right] >= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return -1;
};