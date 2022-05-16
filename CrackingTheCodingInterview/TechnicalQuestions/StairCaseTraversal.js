function staircaseTraversal(height, maxSteps) {
    // Write your code here.
      let totalCombos = 0;
      function _backtrack(currHeight) {
          if (currHeight == height) {
              totalCombos++;
              return;
          }
          if (currHeight > height) return;
          
          for (let i = 1; i <= maxSteps; i++) {
              _backtrack(currHeight+i);
          }
      }
      _backtrack(0)
    return totalCombos;
  }