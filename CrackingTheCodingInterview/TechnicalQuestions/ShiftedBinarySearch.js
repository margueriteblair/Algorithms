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