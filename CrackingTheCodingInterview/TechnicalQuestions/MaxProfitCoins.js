function playGame(input) {
    let possibleScores = [];
  
    /*
    def max_profit(coins, value):
      if len(coins) == 1:
          return value + coins[0]
  
      elif len(coins) == 2:
          return value + max(coins)
      else:
           return value + max(
              coins[0] + min(max_profit(coins[2:], value), max_profit(coins[1:-1], value)),
              coins[-1] + min(max_profit(coins[:-2], value), max_profit(coins[1:-1], value))
    
    
     1. if length of currInput = 1, then currSum += currInput[0];
    2. if length of currInput = 2, then currSum += Math.max(currArr[0], currArr[1]);
    */
    const _backtrack = function(currSum, currArr) {
      if (currArr.length === 1) {
        return currSum + currArr[0];
      } else if (currArr.length === 2) {
        return currSum + Math.max(...currArr);
      }
      //[10, 24, 5, 9] => 33 
      //one decision to take first item
      let left = _backtrack(currSum+currArr[0], currArr.slice(1));
      //one decision to take last item
      let right = _backtrack(currSum+currArr[currArr.length-1], currArr.slice(0, currArr.length-1));
    }
  
    _backtrack(0, input);
    return Math.max([...possibleScores]);
  }