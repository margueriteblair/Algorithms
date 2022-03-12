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

  function waterArea2(heights) {
    // Write your code here.
      let maxes = new Array(heights.length).fill(0);
      let leftMax = 0;
      let totalWater = 0;
      for (let i = 0; i < heights.length; i++) {
          maxes[i] = leftMax;
          leftMax = Math.max(leftMax, heights[i]);
      }
      
      let rightMax = 0;
      for (let i = heights.length-1; i>= 0; i--) {
          let minHeight = Math.min(rightMax, maxes[i]);
          if (minHeight > heights[i]) {
              totalWater += minHeight - heights[i];
          }
          rightMax = Math.max(rightMax, heights[i]);
      }
      
      return totalWater;
  }