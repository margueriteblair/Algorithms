function riverSizes(matrix) {
    // Write your code here.
    let rivers = [];
    let directions = [[0, 1], [1, 0], [-1, 0], [0, -1]]
    for (let i = 0; i < matrix.length; i++) {
      for (let j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] === 1) {
          //start bfs
          let currentSize = 0;
          let q = [[i, j]];
  
          while (q.length) {
            let curr = q.shift();
            let currRow = curr[0];
            let currCol = curr[1];
            currentSize++;
  
            matrix[currRow][currCol] = 0;
  
            for (const dir of directions) {
              let nextRow = dir[0] + currRow;
              let nextCol = dir[1] + currCol;
              if (nextRow < 0 || nextRow >= matrix.length || nextCol < 0 || nextCol >= matrix[0].length || matrix[nextRow][nextCol] === 0) {
                continue;
              }
  
              if (matrix[nextRow][nextCol] === 1) {
                matrix[nextRow][nextCol] = 0;
                q.push([nextRow, nextCol]);
              }
            }
          }
          rivers.push(currentSize);
        }
      }
    }
    console.log(matrix)
    return rivers;
  }