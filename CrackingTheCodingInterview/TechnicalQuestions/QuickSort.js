function quickSort(array) {
    // Write your code here.
      //sort every other number in the array, with respect to the pivot
      //every number greater than the pivot moves to the right
      //every number less than the pivot moves to the left
      //do that until the entire array is sorted
    //[8, 5, 2, 9, 5, 6, 3]
      //p   l							 r
      //picking 8 as pivot
      //pick pivot, iterate through, and place pivot correctly
      //two subarrays form to left & right of pivot
      //list of length 1 it is sorted and in its final position
      //leftNum > pivot, right < pivot
      //pick random pivot
      //time: worst case O(N^2) when we pick our pivot that doesn't divide the list evenly
      //time: best case O(n log n)
      //avg: O(n log n)
      //space: O(logN) the recursive stack 
      quickSortHelper(array, 0, array.length-1);
      return array;
  }
  
  function quickSortHelper(array, start, end) {
      if (start > end) return;
      const pivotIndex = start;
      let leftIdx = start+1;
      let rightIdx = end;
      while (rightIdx >= leftIdx) {
          //left > pivot, right < pivot, then swap left and right;
          if (array[leftIdx] > array[pivotIndex] && array[rightIdx] < array[pivotIndex]) {
              swap(leftIdx, rightIdx, array);
          }
          if (array[leftIdx] <= array[pivotIndex]) leftIdx++;
          if (array[rightIdx] >= array[pivotIndex]) rightIdx--;
      }
      swap(pivotIndex, rightIdx, array);
      const leftSubarrayIsSmaller = rightIdx - 1 - start < end - (rightIdx + 1)
      if (leftSubarrayIsSmaller) {
          quickSortHelper(array, start, rightIdx-1);
          quickSortHelper(array, rightIdx+1, end);
      } else {
          quickSortHelper(array, rightIdx+1, end);
          quickSortHelper(array, start, rightIdx-1);
      }
  }
  
  function swap(i, j, array) {
      let tmp = array[i];
      array[i] = array[j];
      array[j] = tmp;
  }