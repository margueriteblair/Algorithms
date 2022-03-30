var decodeString = function(s) {
    let stack = [];
    let res = "";
    for (let i = 0; i < s.length; i++) {
        if (s[i] !== "]") {
            stack.push(s[i]);
        } else if (s[i] === "]") {
            let curr = ""
            while (stack.length !== 0 && stack[stack.length-1] !== "[") {
                curr = stack.pop() + curr;
            }
            stack.pop(); //this should pop the opening square bracket
            let k = ""
            while ((/[0-9]/).test(stack[stack.length-1])) {
                k = stack.pop() + k;
            }
            let multiplier = parseInt(k) //gets the k val for this one
            for (let j = 0; j < multiplier; j++){
                stack.push(curr);
            }
        }
    }
    while (stack.length) {
        res = stack.pop() + res;
    }
    return res;
};