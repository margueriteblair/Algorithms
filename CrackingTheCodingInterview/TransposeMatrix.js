/*
Different ways to transpose a matrix in JS
*/

var transpose = function(matrix) {
    return Object.keys(matrix[0]).map(function(c) {
        return matrix.map(function(r) { return r[c]; });
    });
};

var transpose = function(matrix) {
    let res = [];
    for (let i = 0; i < matrix[0].length; i++) {
        res.push([]);
    }
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[0].length; j++) {
            res[j].push(matrix[i][j]);
        }
    }
    return res;
};