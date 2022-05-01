var asteroidCollision = function(asteroids) {
    const stack = [];
    let blows = false;
    for (let i = 0; i < asteroids.length; i++) {
        blows = false;
        while (stack.length !== 0 && asteroids[i] < 0 && stack[stack.length-1] >0 && !blows ) {
            if (-asteroids[i] < stack[stack.length-1]) {
                blows = true;
            } else {
                if (-asteroids[i] === stack[stack.length-1]) {
                    blows = true;
                    stack.pop();
                } else {
                    stack.pop();
                }
            }
        }
        if (!blows) {
            stack.push(asteroids[i])
        }
    }
    return stack;
};