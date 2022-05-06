function sortedSquaredArray(array) {
    // Write your code here.
      let response = new Array(array.length).fill(0);
      let i = 0;
      let j = array.length-1;
      for (let resIdx = response.length-1; resIdx >= 0; resIdx--) {
          if (Math.abs(array[i]) > Math.abs(array[j])) {
              let val = array[i];
              response[resIdx] = val * val;
              i++;
          } else {
              let val = array[j];
              response[resIdx] = val * val;
              j--;
          }
      }
    return response;
  }