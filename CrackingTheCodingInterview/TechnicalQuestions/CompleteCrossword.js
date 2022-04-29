function completeCrossword(words) {
    let n = words[0].length;
    // const crossword = [];
  
    function _backtrack(currBoard, currNum) {
     // console.log(currBoard);
      if (currNum === n) {
        if (isValid(currBoard, words)) {
          return currBoard;
        } 
        return;
      }
  
      for (const word of words) {
        currBoard.push(word);
        let val = _backtrack(currBoard, currNum+1);
        if (val) {
            return val;
        }
        currBoard.pop();
      }
    }
  
    return _backtrack([], 0);
  }
  
  function isValid(crossboard, words) {
    for (let i = 0; i < crossboard.length; i++) {
      let currWord = "";
      for (let j = 0; j < crossboard.length; j++) {
        currWord += crossboard[j][i];
      }
  
      if (!words.includes(currWord)) {
        return false;
      }
    }
    return true;
  }
  
  console.log(completeCrossword(["owe", "cot", "cat", "ten", "awe", "car"]));