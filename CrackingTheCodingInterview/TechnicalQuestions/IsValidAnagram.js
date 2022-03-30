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

var isAnagram2 = function(s, t) {
    if (s.length !== t.length) return false;
    let counters = new Array(26).fill(0);
    for (let i = 0; i < s.length; i++) {
        counters[s[i].charCodeAt(0) - 'a'.charCodeAt(0)]++;
        counters[t[i].charCodeAt(0) - 'a'.charCodeAt(0)]--;
    }
    for (let count of counters) {
        if (count !== 0) {
            return false;
        }
    }
    return true;
};