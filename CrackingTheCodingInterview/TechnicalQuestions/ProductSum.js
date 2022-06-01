function productSum(array, mult = 1) {
    // Write your code here.
    let sum = 0;
    for (const elem of array) {
      if (Array.isArray(elem)) {
        sum += productSum(elem, mult+1);
      } else {
        sum += elem;
      }
    }
    return sum * mult;
  }

  function productSum2(array) {
    return productSumHelper(array, 1);
  }
  
  function productSumHelper(arr, mult) {
    let sum = 0;
    for (const el of arr) {
      if (Array.isArray(el)) {
        sum += productSumHelper(el, mult+1);
      } else {
        sum += el;
      }
    }
    return sum * mult;
  } 