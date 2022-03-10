function tournamentWinner(competitions, results) {
    // Write your code here.
      let scores = new Map(); //k space because k is the number of teams
      let winner = "";
      let max = 0;
      for (let i = 0; i < results.length; i++) {
          if (results[i] == 1) {
              scores.set(competitions[i][0], scores.get(competitions[i][0])+3 || 3);
  
          } else {
              scores.set(competitions[i][1], scores.get(competitions[i][1])+3 || 3);
  
          }
      }
      for (const [key, value] of scores) {
          if (value > max) {
              max = value;
              winner = key;
          }
      }
    return winner;
  }