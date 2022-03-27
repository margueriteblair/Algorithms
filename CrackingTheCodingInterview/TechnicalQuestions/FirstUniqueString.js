var firstUniqChar = function(s) {
    let map = new Map();
    for (let i = 0; i < s.length;i++) {
        map.set(s[i], map.get(s[i])+1 || 1);
    }
    
    for (let i = 0; i < s.length; i++) {
        if (map.get(s[i]) === 1) return i;
        //because we're going in chronological order STUPID
    }
    return -1;
};