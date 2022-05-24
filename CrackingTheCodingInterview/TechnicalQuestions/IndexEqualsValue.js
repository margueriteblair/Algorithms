function indexEqualsValue(array) {
    // Write your code here.
    for (let i = 0; i < array.length; i++) {
      if (i == array[i]) {
        return i;
      }
    }
    return -1;
  }