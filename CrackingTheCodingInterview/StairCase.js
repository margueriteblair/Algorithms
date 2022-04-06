function numWaysToClimb(n) {
    //hashmap
    const _backtrack = function(currStairs) {
  
      if (currStairs > n) return 0;
      if (currStairs === n ) {
  
        //if in hashmap return
        return 1;
      }
  
      let numCombos = 0
      numCombos += _backtrack(currStairs+1);
      numCombos += _backtrack(currStairs+2);
  
      return numCombos
    }
    return _backtrack(0);
  }
  //time: O(2^N)
  //space: O(2^N)
  //
  
  /*
  
  
  lets say n = 4
                              0
                  1                       2
            1           2           1           2
        1       2     1   2     1       2
      1   2
  
  https://leetcode.com/problems/fibonacci-number/
  */
  console.log(numWaysToClimb(1), "expects 1");
  console.log(numWaysToClimb(2), "expects 2");
  console.log(numWaysToClimb(3), "expects 3");
  console.log(numWaysToClimb(4), "expects 5");
  console.log(numWaysToClimb(5), "expects 8");
  console.log(numWaysToClimb(6), "expects 13");
  