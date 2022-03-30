var evalRPN = function(tokens) {
    let value = 0;
    let stack = [];
    for (let token of tokens) {
        if (+token) {
            stack.push(parseInt(token));
        } else {
            let curr = 0;
            let second = stack.pop();
            let first = stack.pop();
            if (token == "+") {
                curr = (first + second);
            } else if (token == "-") {
                curr = (first - second);
            } else if (token == "*") {
                curr = first * second;
            } else if (token == "/") {
                curr = parseInt(first / second);
                console.log(first, second, curr);
            }
            
            stack.push(curr);
        }
    }
    return stack.pop();
};