var numTilePossibilities = function(tiles) {
    if (tiles.length <= 1) return tiles.length;
    const charArr = tiles.split("");
    let combos = 0;
    
    let map = new Map();
    for (const tile of tiles) {
        map.set(tile, map.get(tile)+1 || 1);
    }
    
    var _backtrack = function(currTiles) {
        if (currTiles.length >= 1) {
            combos++;
        }
        
        for (const [char, count] of map) {
            if (count === 0) continue;
            currTiles.push(char);
            map.set(char, count-1);
            _backtrack(currTiles);
            currTiles.pop();
            map.set(char, count);
        }
    }
    
    _backtrack([]);
    return combos;
};