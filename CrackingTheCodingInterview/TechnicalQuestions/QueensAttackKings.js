/**
 * @param {number[][]} queens
 * @param {number[]} king
 * @return {number[][]}
 */
var queensAttacktheKing = function(queens, king) {
    let queenCoords = [];
    
    for (let i = king[1]; i >= 0; i--) { //traversing left
        let found = false;
        for (let j = 0; j < queens.length; j++) {
            if (queens[j][0] == king[0] && queens[j][1] == i) {
                queenCoords.push([king[0], i]);
                found = !found;
                break;
            }
        }
        if (found) break;
    }
    
    for (let i = king[0]; i >= 0; i--) {
        //traversing upwards
        let found = false;
        for (let j = 0; j < queens.length; j++) {
            if (queens[j][0] == i && queens[j][1] == king[1]) {
                queenCoords.push([i, king[1]]);
                found = !found;
                break;
            }
        }
        if (found) break;
    }
    
    for (let i = king[1]; i < 8; i++) {
        //traversing right
        let found = false;
        for (let j = 0; j < queens.length; j++) {
            if (queens[j][0] == king[0] && queens[j][1] == i) {
                queenCoords.push([king[0], i]);
                found = !found;
                break;
            }
        }
        if (found) break;
    }
    
    for (let i = king[0]; i < 8; i++) {
        //traversing downwards
        let found = false;
        for (let j = 0; j < queens.length; j++) {
            if (queens[j][0] == i && queens[j][1] == king[1]) {
                queenCoords.push([i, king[1]]);
                found = !found;
                break;
            }
        }
        if (found) break;
    }
    
    let i = king[0]
    let j = king[1];
    while (i < 8 && j < 8) {
        let found = false;
        for (let k = 0; k < queens.length; k++) {
            if (queens[k][0] == i && queens[k][1] == j) {
                queenCoords.push([i, j]);
                found = !found;
                break;
            }
        }
        i++
        j++;
        if (found) break;
    }
    
    i = king[0]
    j = king[1];
    while (i >= 0 && j < 8) {
        let found = false;
        for (let k = 0; k < queens.length; k++) {
            if (queens[k][0] == i && queens[k][1] == j) {
                queenCoords.push([i, j]);
                found = !found;
                break;
            }
        }
        i--
        j++;
        if (found) break;
    }
    
    i = king[0]
    j = king[1];
    while (i >= 0 && j >= 0) {
        let found = false;
        for (let k = 0; k < queens.length; k++) {
            if (queens[k][0] == i && queens[k][1] == j) {
                queenCoords.push([i, j]);
                found = !found;
                break;
            }
        }
        i--
        j--;
        if (found) break;
    }
    
    i = king[0]
    j = king[1];
    while (i < 8 && j >= 0) {
        let found = false;
        for (let k = 0; k < queens.length; k++) {
            if (queens[k][0] == i && queens[k][1] == j) {
                queenCoords.push([i, j]);
                found = !found;
                break;
            }
        }
        i++
        j--;
        if (found) break;
    }
    
    return queenCoords;
};

var queensAttacktheKing2 = function(queens, king) {
    let res = [];
    let seen = Array(8).fill(false).map(() => new Array(8).fill(false));
   
    for (const queen of queens) {
        seen[queen[0]][queen[1]] = true;
    }
    
    const directions = [-1, 0, 1];
    
    for (const dx of directions) {
        for (const dy of directions) {
            if (dx == 0 && dy == 0) continue;
            
            let x = king[0];
            let y = king[1]
            
            while (x + dx >= 0 && x + dx < 8 && y + dy >= 0 && y + dy < 8) {
                x += dx;
                y += dy;
                if (seen[x][y]) {
                    res.push([x, y]);
                    break;
                }
            }
        }
    }
    return res;
};