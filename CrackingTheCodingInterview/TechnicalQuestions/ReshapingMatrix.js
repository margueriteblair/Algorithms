var matrixReshape = function(mat, r, c) {
    if (mat.length == 0 || c * r != (mat.length * mat[0].length)) return mat;
    let res = new Array(r).fill(0).map(() => new Array(c).fill(0))
    //otherwise, return original matrix
    console.log(res)
    if (r ==  mat.length && c == mat[0].length) return mat;
    let row = 0, col = 0;
    for (let i = 0; i < mat.length; i++) {
        for (let j = 0; j < mat[0].length; j++) {
            res[row][col] = mat[i][j];
            if (col < c-1) {
                col++;
            } else if (col == c-1) {
                col = 0;
                row++;
            }
        }
    }
    return res;
};