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