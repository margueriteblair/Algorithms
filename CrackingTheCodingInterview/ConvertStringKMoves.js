var canConvertString = function(s, t, k) {
    let charMap = new Array(26).fill(0);
    if (s.length !== t.length) return false;
    for (let i=0; i < s.length; i++) {
        if (s[i] === t[i]) continue;
        let charDifference = Math.abs(s[i].charCodeAt(0) - t[i].charCodeAt(0));
       // let charMapIdx = s[i].charCodeAt(0) - 'a'.charCodeAt(0)
        if (((charMap[charDifference] * 26) + charDifference) > k) {
            return false;
        } 
        console.log(charMap)
        charMap[charDifference]++;
        
    }
    
    return true;
};