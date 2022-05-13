function threeNumberSort(array, order) {
    // Write your code here.
      //sort of like dutch flag problem
      let low = 0;
      let mid = 0;
      let high = array.length-1;
      while (mid <= high) {
          if (array[mid] === order[2]) {
              let tmp = array[mid];
              array[mid] = array[high];
              array[high] = tmp;
              high--;
          } else if (array[mid] === order[0]) {
              let tmp = array[mid];
              array[mid] = array[low];
              array[low] = tmp;
              low++;
              mid++;
          } else {
              mid++;
          }
      }
      return array;
  }
  