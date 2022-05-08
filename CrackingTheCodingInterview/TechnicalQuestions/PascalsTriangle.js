var generate = function(numRows) {
    const triangle = [];
    const firstRow = [1];
    triangle.push(firstRow);
    
    let row = 1;
    while (row < numRows) {
        let currRow = [];
        let prevRow = triangle[row-1];
        
        currRow.push(1)
        
        for (let col = 1; col < prevRow.length; col++) {
            currRow.push(prevRow[col-1] + prevRow[col]);
        }
        
        currRow.push(1);
        
        triangle.push(currRow);
        row++;
    }
    
    return triangle
};