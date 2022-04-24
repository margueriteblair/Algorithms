var minKnightMoves = function(x, y) {
    const knightMoves = [[-2, -1], [2, 1], [-2, 1],[2, -1], [1, -2], [1, 2], [-1, 2], [-1, -2]];
    let queue = [];
    queue.push([0,0])
    let moves = 0;
    while (queue.length) {
        let count = 0;
        let len = queue.length;
        while (count < len) {
            let curr = queue.shift();
            let currX = curr[0]
            let currY = curr[1];
            if (currX === x && currY === y) return moves;
            for (const dir of knightMoves) {
                if (currX + dir[0] === x && currY + dir[1] === y) return moves+1;
                queue.push([currX + dir[0], currY + dir[1]]);
            }
            count++;
        }
        moves++;
    }
    return moves;
};