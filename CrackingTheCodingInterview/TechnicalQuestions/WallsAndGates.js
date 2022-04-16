let directions = [[-1, 0], [0, 1], [1, 0], [0, -1]];
var wallsAndGates = function(rooms) {
    let seen = new Array(rooms.length).fill(false).map(() => new Array(rooms[0].length).fill(false))
    let q = [];
    for (let i = 0; i < rooms.length; i++) {
        for (let j = 0; j < rooms[i].length; j++) {
            if (rooms[i][j] === 0) {
                seen[i][j] = true;
                q.push([i, j])
            }
        }
    }
    while (q.length) {
        let curr = q.shift();
        let currRow = curr[0]
        let currCol = curr[1];

        for (const dir of directions) {
            let nextRow = currRow + dir[0];
            let nextCol = currCol + dir[1];

            if (nextRow >= 0 && nextRow < rooms.length && nextCol >= 0 && nextCol < rooms[0].length && rooms[nextRow][nextCol] !== -1 && rooms[nextRow][nextCol] !== 0 && !seen[nextRow][nextCol]) {
                q.push([nextRow, nextCol]);
                rooms[nextRow][nextCol] = Math.min(rooms[currRow][currCol]+1, rooms[nextRow][nextCol]);
                seen[nextRow][nextCol] = true;

            }
        }
     }
    return rooms;
};