var compress = function(chars) {
    let s = "";
    for (let i = 0; i <chars.length; i++) {
        let consec = 0;
        let j = i;
        while (chars[j] == chars[i]) {
            j++;
            consec++;
        }
        console.log(consec)
        i = j-1;
        
        if (consec == 1) {
            s += chars[i];
        } else {
            s = s + chars[i] + consec;
        }
    }
    for (let i = 0; i < s.length; i++) {
        chars[i] = s[i];
    }
    return s.length;
};