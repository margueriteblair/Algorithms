// Reverse Order

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    if (matrix.length === 0) return [];
    let top = 0;
    let left = 0;
    let right = matrix[0].length-1;
    let bottom = matrix.length-1;
    let res = [];
    while (top <= bottom && left <= right) {
        for (let i = top; i <= bottom; i++ ) {
            res.push(matrix[i][left]);
        }
        
        left++;
        if (left > right) break;
        
        for (let i = left; i <= right; i++) {
            res.push(matrix[bottom][i])
        }
        
        bottom--;
        if (bottom < top) break;
        
        for (let i = bottom; i >= top; i--) {
            res.push(matrix[i][right]);
        }
        
        right--;
        if (right < left) break;
        
        for (let i = right; i >= left; i--) {
            res.push(matrix[top][i]);
        }
        
        top++;
    }
    return res;
};


/**
 * @param {number[][]} matrix
 * @return {number[]}
 Here we are guaranteed to have a square matrix
 */
var spiralOrderSquare = function(matrix) {
    let upperLeft = 0 //top & left will mimic
    //these two will always have to add up to the length & complement one another
    let length = matrix.length
    let res = [];
    while (upperLeft <= length / 2) {
        for (let i = upperLeft; i < length; i++) {
            res.push(matrix[upperLeft][i])
        }
        length--;
        if (upperLeft > length/2) break;
        
        for (let i = upperLeft+1; i <= length; i++) {
            res.push(matrix[i][length]);
        }
        
        for (let i = length-1; i >= upperLeft; i--) {
            res.push(matrix[length][i]);
        }
        
        
        for (let i = length-1; i > upperLeft; i--) {
            res.push(matrix[i][upperLeft]);
        }
        upperLeft++;
    }
    return res;
};