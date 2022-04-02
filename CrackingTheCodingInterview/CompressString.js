var compress = function(chars) {
    let s = "";
    for (let i = 0; i <chars.length-1; i++) {
        let consec = 0;
        let j = i;
        while (chars[j] == chars[i]) {
            j++;
            consec++;
        }
        i = j-1;
        
        if (consec == 1) {
            s += chars[i];
        } else {
            s = s + chars[i] + consec;
        }
    }
    return s.length;
};