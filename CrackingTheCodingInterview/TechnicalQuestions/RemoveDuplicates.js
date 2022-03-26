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

var removeDuplicates2 = function(s) {
    let stack = [];
    for (let c of s) {
        if (stack.length !== 0 && stack[stack.length-1] === c) {
            stack.pop();
        } else {
            stack.push(c);
        }
    }
    return stack.join("");
};