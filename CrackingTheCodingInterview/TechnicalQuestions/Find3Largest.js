function findThreeLargestNumbers(array) {
    // Write your code here.
      let largest = new Array(3);
      let greatest = [0, -Infinity];
      for (let i = 0; i < array.length; i++) {
          if (array[i] > greatest[1]) {
              greatest[1] = array[i];
              greatest[0] = i;
          }
      }
      largest[2] = greatest[1];
      
      let secondLargest = [0, -Infinity];
      for (let i = 0; i < array.length; i++) {
          if (array[i] > secondLargest[1] && i !== greatest[0]) {
              secondLargest[1] = array[i];
              secondLargest[0] = i;
          }
      }
      
      largest[1] = secondLargest[1];
      
      let thirdLargest = [0, -Infinity];
      for (let i = 0; i < array.length; i++) {
          if (array[i] > thirdLargest[1] && i !== greatest[0] && i !== secondLargest[0]) {
              thirdLargest[1] = array[i];
              thirdLargest[0] = i;
          }
      }
      
      largest[0] = thirdLargest[1]
      return largest;
      
  }