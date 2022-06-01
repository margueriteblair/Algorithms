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