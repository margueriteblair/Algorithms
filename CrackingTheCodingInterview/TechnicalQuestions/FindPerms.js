const findPerms = function(str) {
    const res = [];

    const _swap = function(str, i, j) {

        let tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
        return str.join("");
    }

    const _backtrack = function(alphabets, idx1, idx2) {
      if (idx1 === idx2) {
        res.push(alphabets.join(""));
        return;
      }

      for (let i = idx1; i <= idx2; i++) {
          _swap(alphabets, idx1, i);
          _backtrack(alphabets,idx1+1, idx2);
          _swap(alphabets, i, idx1);
      }
    }

    _backtrack(str, 0, str.length-1)
    return res;
  }
  
  console.log(findPerms("abc".split("")));