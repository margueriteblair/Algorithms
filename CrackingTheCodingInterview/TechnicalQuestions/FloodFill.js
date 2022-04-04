function floodFill(image, sr, sc, newColor) {
    let color = image[sr][sc];
    if (color !== newColor) {
      _dfs(sr, sc);
    }
    return image;
  
    function _dfs(row, col) {
      // if (image[row][col] === color) {
      //   image[row][col] = newColor;
      //   if (row > 0) _dfs(row-1, col);
      //   if (col > 0) _dfs(row, col-1);
      //   if (row < image.length-1) _dfs(row+1, col);
      //   if (col < image[0].length-1) _dfs(row, col+1); 
      // }
      if(image[row]?.[col] === color) {
        image[row][col] = newColor
        for(let [dr, dc] of [[0,1], [1,0], [-1, 0], [0, -1]]) {
          _dfs(row + dr, col + dc);
        }
      }
    }
    function _dfs2(row, col) {
        if (image[row][col] === color) {
          image[row][col] = newColor;
          if (row > 0) _dfs2(row-1, col);
          if (col > 0) _dfs2(row, col-1);
          if (row < image.length-1) _dfs2(row+1, col);
          if (col < image[0].length-1) _dfs2(row, col+1); 
        }
      }
  }