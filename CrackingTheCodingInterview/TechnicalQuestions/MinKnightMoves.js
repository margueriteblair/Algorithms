var minKnightMoves = function(x, y) {
    const knightMoves = [[-2, -1], [2, 1], [-2, 1],[2, -1], [1, -2], [1, 2], [-1, 2], [-1, -2]];
    let queue = [];
    queue.push([0,0])
    let moves = 0;
    let seen = new Array(607).fill(false).map(() => new Array(607).fill(false));
    while (queue.length) {
        let count = 0;
        let len = queue.length;
        while (count < len) {
            let curr = queue.shift();
            let currX = curr[0]
            let currY = curr[1];
            seen[currX+302][currY+302] = true;
            if (currX === x && currY === y) return moves;
            for (const dir of knightMoves) {
                if (currX + dir[0] === x && currY + dir[1] === y) return moves+1;
                if (!seen[currX + dir[0] + 302][currY + dir[1] + 302]) {
                    seen[currX + dir[0] + 302][currY + dir[1] + 302] = true;
                    queue.push([currX + dir[0], currY + dir[1]]);
                }
                
            }

            count++;
        }
        moves++;
    }
    return moves;
};