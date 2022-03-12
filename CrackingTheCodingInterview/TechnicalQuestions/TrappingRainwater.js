function waterArea(heights) {
    // Write your code here.
      let totalWater = 0;
      for (let i = 0; i < heights.length; i++) {
          let left = 0;
          for (let j = 0; j < i; j++) {
              left = Math.max(left, heights[j])
          }
          
          let right = 0;
          for (let j = i+1; j < heights.length; j++) {
              right = Math.max(right, heights[j]);
          }
          
          if (Math.min(left, right) - heights[i] > 0) {
              totalWater += Math.min(left, right) - heights[i];
          }
      }
      return totalWater;
  }