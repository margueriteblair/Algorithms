var validateStackSequences = function(pushed, popped) {
    let stack = [];
    let i = 0;
    for (let num of pushed) {
        stack.push(num)
        while (stack.length && stack[stack.length-1] === popped[i]) {
            stack.pop();
            i++;
        }
    }
    
    return i == pushed.length;
};