function isMonotonic(array) {
    // Write your code here.
      if (array.length < 2) return true;
      let isIncreasing = array[0] < array[array.length-1];
      for (let i = 0; i < array.length; i++) {
          if (isIncreasing) {
              if (array[i] > array[i+1]) return false;
          } else {
              if (array[i+1] > array[i]) return false;
          }
      }
      return true;
  }