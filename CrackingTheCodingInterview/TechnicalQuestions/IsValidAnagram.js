var isAnagram = function(s, t) {
    let sMap = new Map();
    let tMap = new Map();
    for (let c of s) {
        sMap.set(c, sMap.get(c)+1 || 1);
    }
    
    for (let c of t) {
        tMap.set(c, tMap.get(c)+1 || 1);
    }
    
    if (sMap.size !== tMap.size) return false;
    for (const [key, val] of sMap) {
        if (!tMap.has(key)) {
            return false;
        } else {
            if (tMap.get(key) !== val) return false;
        }
    }
    return true;
};