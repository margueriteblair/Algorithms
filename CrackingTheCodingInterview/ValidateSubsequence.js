function isValidSubsequence(array, sequence) {
    // Write your code here.
      let j = 0;
      let curr = sequence[j]
      let placeholderIdx = -1;
      for (let i = 0; i < array.length; i++) {
          if (array[i] === curr && i > placeholderIdx) {
              j++;
              curr = sequence[j];
              placeholderIdx = i;
          }
      }
      
      return j === sequence.length ? true : false;
  }
 
  function isValidSubsequence2(array, sequence) {
    // Write your code here.
      let seqIndx = 0;
      for (const val of array) {
          if (seqIndx === sequence.length) break;
          if (sequence[seqIndx] === val) seqIndx++;
      }
      return seqIndx === sequence.length;
  } 