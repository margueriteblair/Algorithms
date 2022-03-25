const findPerms = function(str) {
    const res = [];

    const _swap = function(str, i, j) {
        let tmp;
        let charArr = str.split("");
        tmp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = tmp;
        return charArr.join("");
    }
    
    const _backtrack = function(curr, idx) {
      if (curr.length == idx) {
        res.push(curr);
        return;
      }

      for (let i = 0; i < str.length; i++) {
          curr = swap(curr, idx, i);
          _backtrack(curr,idx+1)
          curr = swap(curr, i, idx);
      }
    }


  
    _backtrack("", 0);
    return res;
  }
  
  console.log(findPerms("abc"));