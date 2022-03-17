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
            if (queens[0] == king[0] && queens[1] == i) {
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
        let found = false;
        for (let i = 0; i < queens.length; i++) {
            if (queens[i][0] == i && queens[i][1] == king[1]) {
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
            if (queens[k][0] == j && queens[k][1] == j) {
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
    while (i < 8 && j < 8) {
        let found = false;
        for (let k = 0; k < queens.length; k++) {
            if (queens[k][0] == j && queens[k][1] == j) {
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
            if (queens[k][0] == j && queens[k][1] == j) {
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
    while (i >= 0 && j >= 0) {
        let found = false;
        for (let k = 0; k < queens.length; k++) {
            if (queens[k][0] == j && queens[k][1] == j) {
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