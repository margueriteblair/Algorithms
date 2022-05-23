function mergeOverlappingIntervals(array) {
    // Write your code here.
      let merged = [];
      array.sort((a, b) =>  a[0] - b[0] );
      for (let i = 0; i < array.length; i++) {
          let j = i+1;
          let start = array[i][0];
          let end = array[i][1];
          while (j < array.length && array[j][0] <= end) {
              end = Math.max(end, array[j][1]);
              j++;
          }
          
          merged.push([start, end]);
          i = j-1;
      }
      console.log(array)
    return merged;
  }