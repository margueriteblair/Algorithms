function smallestDifference(arrayOne, arrayTwo) {
    // Write your code here.
      //sort both arrays, so we have them in asc order
      arrayOne.sort((a, b) => { return a - b });
      arrayTwo.sort((a, b) => { return a - b });
      
      //create two pointers to test all combos
      //[-1, 3, 5, 10, 20, 28]
      //                    i
      //[15, 17, 26, 134, 135]
      //         j
      console.log(arrayOne);
      console.log(arrayTwo);
      let num1 = arrayOne[0];
      let num2 = arrayTwo[0];
      let smallestDiff = Math.abs(num1 - num2);
      
      let i = 0, j = 0;
      while (i < arrayOne.length && j < arrayTwo.length) {
          let currDiff = Math.abs(arrayOne[i] - arrayTwo[j]);
          console.log(currDiff);
          if (currDiff < smallestDiff) {
              smallestDiff = currDiff;
              num1= arrayOne[i]
              num2 = arrayTwo[j];
          }
          
          if (arrayOne[i] < arrayTwo[j]) {
              i++;
          } else {
              j++;
          }
      }
      
      return [num1, num2];
  }