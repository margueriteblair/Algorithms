var asteroidCollision = function(asteroids) {
    const stack = [];
    
    for (let i = 0; i < asteroids.length; i++) {
        if (asteroids[i] > 0) {
            stack.push(asteroids[i]);
        } else {
            if (stack.length === 0 || stack[stack.length-1] < 0) {
                stack.push(asteroids[i]);
            } else {
                while (Math.abs(asteroids[i]) >= stack[stack.length-1] && stack[stack.length-1] > 0) {
                    stack.pop();
                }
            }
        }
        console.log(stack)
    }
    return stack;
};