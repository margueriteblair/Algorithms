function spiralTraverse(array) {
    // Write your code here.
      if (array.length === 0) {
          return[];
      }
      let top = 0;
      let bottom = array.length-1;
      let left = 0;
      let right = array[0].length-1;
      let res = [];
      
      while (top <= bottom && left <= right) {
          for (let i = left; i <= right; i++) {
              res.push(array[top][i]);
          }
          top++;
          if (top > bottom) break;
          
          for (let i = top; i <= bottom; i++) {
              res.push(array[i][right]);
          }
          
          right--;
          if (right < left) break;
          
          for (let i = right; i >= left; i--) {
              res.push(array[bottom][i])
          }
          
          bottom--;
          if (bottom < top) break;
          
          for (let i = bottom; i >= top; i--) {
              res.push(array[i][left]);
          }
          
          left++;
      }
      return res;
  }