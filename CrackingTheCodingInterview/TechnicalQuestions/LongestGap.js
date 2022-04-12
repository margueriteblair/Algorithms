function longestGapV2(keyPresses) {
    if (keyPresses.length < 1) {
      return -1;
    }
    // keyPresses.sort((a, b) => a[1] - b[1]);
  
    let longestTime = 0;
    let character = keyPresses[0][0];
    for (let i = 1; i < keyPresses.length; i++) {
      const timeDiff = keyPresses[i][1] - keyPresses[i-1][1]
  
      if (timeDiff > longestTime) {
        longestTime = timeDiff;
        character = keyPresses[i][0];
      }
    }
    return character;
  }