function indexEqualsValue(array) {
    // Write your code here.
    for (let i = 0; i < array.length; i++) {
      if (i == array[i]) {
        return i;
      }
    }
    return -1;
  }

function indexEqualsValue2(array) {
    // Write your code here.
   return binarySearch(array, 0, array.length-1);
  }
  
  function binarySearch(array, left, right) {
    if (left > right) return -1;
  
    let mid = Math.floor((left+right)/2);
  
    if (array[mid] < mid) {
      return binarySearch(array, mid+1, right);
    } else if (array[mid] === mid && mid === 0) {
      return mid;
    } else if (array[mid] === mid && array[mid-1] < mid-1) {
      return mid;
    } else {
      return binarySearch(array, left, mid-1);
    }
  }