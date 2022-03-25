function firstBad(n, commits) {
    let firstPos = binarySearch(commits, 0, n-1); //have to account for 1 indexing of arrays
    let tmp;
    while (firstPos !== -1) {
      tmp = firstPos;
      firstPos = binarySearch(commits, 0, firstPos-1);
    }
    firstPos = tmp;
    return firstPos + 1;
  
  }
  
  function binarySearch(arr, left, right) {
    while (left <= right) {
      let mid = Math.floor((left+right)/2);
      if (arr[mid] === false) {
        return mid;
      }
      if (!arr[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }