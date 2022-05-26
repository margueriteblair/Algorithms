function balancedBrackets(string) {
    // Write your code here.
    let stack = [];
    for (let i = 0; i < string.length; i++) {
      if (string[i] === '(' || string[i] === '[' || string[i] === '{') {
        stack.push(string[i]);
      } else if (string[i] === ']') {
        if (stack.length && stack[stack.length-1] === '[') {
          stack.pop();
        } else {
          return false;
        }
      } else if (string[i] === ')') {
        if (stack.length && stack[stack.length-1] === '(') {
          stack.pop();
        } else {
          return false;
        }
      } else if (string[i] === '}') {
        if (stack.length && stack[stack.length-1] === '{') {
          stack.pop();
        } else {
          return false;
        }
      }
    }
  
    return stack.length === 0 ? true : false;
  }