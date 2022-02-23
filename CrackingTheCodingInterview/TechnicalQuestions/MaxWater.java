class MaxWater {
    public static int waterArea(int[] heights) {
  
      //dynamic programming
          //for each index, how much water will be held right above
          //if it's a 0 it's not a pillar
          //tallest pillar
          //min height of two biggest pillars on either side of an index
          //minHeight = min(leftMax, rightMax);
          //if heights[i] < minHeight then we store water 
          //iterate once forward and once backwards
          //O(N) time
          //O(N)  
          int leftMax = 0;
          int rightMax = 0;
          int[] maxes = new int[heights.length];
          for (int i = 0; i < heights.length; i++) {
              int height = heights[i];
              maxes[i] = leftMax;
              leftMax = Math.max(leftMax, height);
          }
          for (int i = heights.length-1; i >= 0; i--) {
              int height = heights[i];
              int minHeight = Math.min(rightMax, maxes[i]);
              if (height < minHeight) {
                  maxes[i] = minHeight - height;
              } else {
                  maxes[i] = 0;
              }
              rightMax = Math.max(rightMax, height);
          }
      int sum = 0;
          for (int i = 0; i < maxes.length; i++) {
              sum += maxes[i];
          }
          return sum;
    }
}
