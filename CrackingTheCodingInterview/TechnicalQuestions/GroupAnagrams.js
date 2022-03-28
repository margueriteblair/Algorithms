var groupAnagrams = function(strs) {
    if (strs.length == 0) return [];
    let map = new Map();
    for (let str of strs) {
        let s = str.split("").sort().join("");
        if (!map.has(s)) {
            map.set(s, []);
        }
        map.get(s).push(str);
    }
    
    let res = []
    for (const vals of map.values()) {
        res.push(vals);
    }
    return res;  
};