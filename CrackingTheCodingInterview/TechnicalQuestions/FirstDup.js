function solution(a) {
    let map = new Map();
    for (const val of a) {
        map.set(val, map.get(val)+1 || 1);
        if (map.get(val) == 2) return val;
    }
    return -1;
}