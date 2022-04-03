var isIsomorphic = function(s, t) {
    if (s.length !== t.length) {
        return false;
    }
    let mapS = new Map();
    let mapT = new Map();
    for (let i = 0; i < s.length; i++) {
        if (mapS.has(s[i])) {
            if (mapS.get(s[i]) !== t[i]) return false;
        } else if (mapT.has(t[i])) {
            if (mapT.get(t[i]) !== s[i]) return false;
        } else {
            mapS.set(s[i], t[i]);
            mapT.set(t[i], s[i]);
        }
    }
    return true;
};