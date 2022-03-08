function firstDuplicateValue(array) {
    // Write your code here.
      //O(n) time and O(1) space is optimal, so no need for another data structure
      // [-2,-1,5,2,-3,3,4]
      // 1 .. n
      // 0 .. n-1
      for (let i = 0; i < array.length; i++) {
          if (array[Math.abs(array[i])-1] < 0) {
              return Math.abs(array[i])
          } else {
              array[Math.abs(array[i])-1] *= -1;
          }
      }
    return -1;
  }