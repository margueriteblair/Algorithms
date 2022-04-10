var matrixBlockSum = function(mat, k) {
    let rows = mat.length;
    let cols = mat[0].length;
    
    let answer = new Array(rows).fill(0).map(() => new Array(cols).fill(0));
    let q = [[0,0]];
    let seen = {};
    while (q.length) {
        let sums = 0;
        const [i, j] = q.shift();
        let [r, c] = [i - k, j - k];
        while (r <= i + k) {
            while (c <= j+k) {
                //check bounds
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    sums += mat[r][c];
                }
                c++;
            }
            r++;
            c = j-k;
        }
        answer[i][j] = sums;
        if (i - 1 >= 0 && !(`${i - 1},${j}` in seen)) q.push([i - 1, j]); // top
        if (i + 1 < rows && !(`${i + 1},${j}` in seen)) q.push([i + 1, j]); // bottom
        if (j - 1 >= 0 && !(`${i},${j - 1}` in seen)) q.push([i, j - 1]); // left
        if (j + 1 < cols && !(`${i},${j + 1}` in seen)) q.push([i, j + 1]); // right
        seen[`${i},${j}`] = true;
    }
    return answer;
};