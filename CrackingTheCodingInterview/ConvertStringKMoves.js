var canConvertString = function(s, t, k) {
    let kArray = new Array(k + 1).fill(false);
    if (s.length !== t.length) return false;
    for (let i=0; i < s.length; i++) {
        if (s[i] === t[i]) continue;
        let charDifference = Math.abs(s[i].charCodeAt(0) - t[i].charCodeAt(0));
        if (charDifference > k) {
            return false;
        } 
        if (kArray[charDifference]) {
            return false;
        }

        kArray[charDifference] = true;
    }
    
    return true;
};