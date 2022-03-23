function isMontonic(input) {
    if (input.length <= 2) {
      return true;
    }
    
    if (input[0] < input[input.length-1]) {
      for (let i = 1;i < input.length; i++) {
        //ascending
        if (input[i-1] > input[i]) return false;
      }
    } else {
      for (let i = 1; i < input.length; i++) {
        if (input[i-1] < input[i]) return false;
      }
    }
    return true;
  
  }
  
  function isMontonic2(input) {
    if (input.length <= 2) {
      return true;
    }
    let isIncreasing = input[0] < input[input.length];
    for (let i = 1; i < input.length; i++) {
      if (isIncreasing && input[i-1] > input[i]) {
          return false;
        //checking for increasing
      } else if (!isIncreasing && input[i-1] < input[i])  {
          return false;
        //checking for decreasing
      }
    }
    return true;
  
  }