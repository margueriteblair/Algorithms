/*
Different ways to transpose a matrix in JS
*/

var transpose = function(matrix) {
    return Object.keys(matrix[0]).map(function(c) {
        return matrix.map(function(r) { return r[c]; });
    });
    return matrix;
};