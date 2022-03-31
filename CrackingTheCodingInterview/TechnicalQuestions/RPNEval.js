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


const OPERATORS = ["+", "-", "/", "*"];

var evalRPN2 = function(tokens) {
    const stack = [];

    for (const token of tokens) {
        if (!OPERATORS.includes(token)) {
            stack.push(Number(token));
            continue;
        }

        const number2 = stack.pop();
        const number1 = stack.pop();

        switch (token) {
            case "+": {
                stack.push(number1 + number2);
                break;
            } case "-": {
                stack.push(number1 - number2);
                break;
            } case "/": {
                stack.push(Math.trunc(number1 / number2));
                break;
            } case "*": {
                stack.push(number1 * number2);
                break;
            }
        }
    }

    return stack.pop();
};