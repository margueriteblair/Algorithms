function sortedSquaredArray(array) {
    // Write your code here.
      let res = [];
      let j = array.length-1;
      let i = 0;
      while (i <= j) {
          if (Math.abs(array[i]) > Math.abs(array[j])) {
              res.push(Math.pow(array[i], 2));
              i++;
          } else {
              res.push(Math.pow(array[j], 2))
              j--;
          }
      }
    return res.reverse();
  }