function threeNumberSum(array, targetSum) {
    // Write your code here.
      array.sort((a, b) => {return a - b});
      let triplets = [];
      for (let i = 0; i < array.length-2; i++) {
          let left = i+1;
          let right = array.length-1;
          while (left < right) {
              let sum = array[i] + array[left] + array[right];
              if (sum === targetSum) {
                  triplets.push([array[i], array[left], array[right]]);
                  while (array[left] === array[left+1]) left++;
                  while (array[right] === array[right-1]) right--;
                  left++;
                  right--;
              } else if (sum < targetSum){
                  left++;
              } else {
                  right--;
              }
          }
      }
      return triplets;
  }