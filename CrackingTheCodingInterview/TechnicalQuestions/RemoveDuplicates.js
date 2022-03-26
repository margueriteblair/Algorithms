var removeDuplicates = function(s) {
    let dups = new Set();
    let alpha = "abcdefghijklmnopqrstuvwxyz";
    for (let i = 0; i < alpha.length; i++) {
        dups.add(alpha[i] + alpha[i]);
    }
    let prev = -1;
    while (prev !== s.length) {
        prev = s.length;
        for (const dup of dups) {
            s = s.replace(dup,"");
        }
    }
    return s;
};