var backspaceCompare = function(s, t) {
    sArr = []
    tArr = []
    for (let i = 0; i < s.length; i++) {
        if (s[i] == '#') {
            sArr.pop()
        } else {
            sArr.push(s[i])
        }
    }
    for (let i = 0; i < t.length; i++) {
        if (t[i] == '#') {
            tArr.pop()
        } else {
            tArr.push(t[i])
        }
    }
    if (sArr.length != tArr.length) {
        return false;
    } else {
        for (let i = 0; i < tArr.length; i++) {
            if (tArr[i] != sArr[i]) {
                return false;
            }
        }
    }
    return true;