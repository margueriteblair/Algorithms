function playGame(coins) {

    function backtrack(coinsArr, currScore) {
      if (coinsArr.length === 1) {
        return currScore + coinsArr[0];
      } else if (coinsArr.length === 2) {
        return currScore + Math.max(coinsArr[0], coinsArr[1]);
      }
  
      return currScore + Math.max(coinsArr[0] + Math.min(backtrack(coinsArr.slice(2), currScore), backtrack(coinsArr.slice(1, coinsArr.length-1), currScore)), coinsArr[coinsArr.length-1] + Math.min(backtrack(coinsArr.slice(0, coinsArr.length-2), currScore), backtrack(coinsArr.slice(1, coinsArr.length-1), currScore))); 
    }
  
    return backtrack(coins, 0);
  }