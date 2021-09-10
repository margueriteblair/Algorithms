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
    return true
}

var backspaceCompare2 = function(s, t) {
    let i = s.length-1;
    let j = t.length-1;
    
    while (i >= 0 || j >= 0) {
        if (s[i] === '#' || t[j] === '#') {
            if (s[i] === '#') {
                let backCount = 2;
                while (backCount > 0) {
                    i--;
                    backCount--;
                    if (s[i] === '#') {
                        backCount+=2;
                    }
                }
            }
            if (t[j] === '#') {
                let backCount = 2;
                while (backCount > 0) {
                    j--;
                    backCount--;
                    if (t[j] === '#') {
                        backCount+=2;
                    }
                }
            }
        } else {
            if (s[i] != t[j]) {
                return false;
            } else {
                i--;
                j--;
            }
        }
    }
    return true;
};