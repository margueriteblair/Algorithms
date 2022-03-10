function arrayOfProducts(array) {
    // Write your code here.
      let output = [];
      for (let i = 0; i < array.length; i++){
          let prod = 1;
          for (let j = 0; j< array.length; j++) {
              if (i != j) {
                  prod *= array[j];
              }
          }
          output[i] = prod;
      }
      return output;
}

function arrayOfProducts2(array) {
    // Write your code here.
      let output = [];
      //two loops, one left & one right, then a third loop to calculate output
      let left = new Array(array.length).fill(0) //where the 1 is at the beginning
      let right = new Array(array.length).fill(0) //where the 1 is at the end
      left[0] = 1;
      right[array.length-1] = 1;
      
      for (let i = 1; i < array.length; i++) {
          left[i] = left[i-1]*array[i-1];
      }
      console.log(left);
      
      for (let i = array.length-2; i >= 0; i--) {
          right[i] = right[i+1]*array[i+1];
      }
      console.log(right);
      for (let i = 0; i < left.length; i++) {
          output[i] = left[i]*right[i]
      }
      return output;
  }