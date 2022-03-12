function moveElementToEnd(array, toMove) {
    // Write your code here.
      let i = 0;
      let j = array.length-1;
      while (i < j) {
          while (array[j] === toMove && i < j) {
              j--;
          }
          while (array[i] != toMove && i < j) {
              i++;
          }
          let tmp = array[j]
          array[j] = array[i]
          array[i] = tmp;
  
      }
      return array;
  }