function kadanesAlgorithm(array) {
    // Write your code here.
      //write a function that takes in a non-empty array of integers and returns the
      //max sum that can be obtained by summing up all integers in a
      //non empty subarray of the input array
      let globalMax = array[0];
      let localMax = array[0];
      for (let i = 1; i < array.length; i++) {
          const num = array[i]
          localMax = Math.max(num, localMax+num);
          globalMax = Math.max(localMax, globalMax);
      }
      
      return globalMax;
  }