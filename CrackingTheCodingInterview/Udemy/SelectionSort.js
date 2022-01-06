function selectionSort(arr) {
    for (let i = 0; i < arr.length; i++) {
      let min = arr[i];
      let swapIndex = i;
      for (let j = i; j < arr.length; j++) {
        if (arr[j] < min) {
          min = arr[j];
          swapIndex = j;
        }
      }
      arr[swapIndex] = arr[i];
      arr[i] = min;
    }
    console.log(arr);
  }