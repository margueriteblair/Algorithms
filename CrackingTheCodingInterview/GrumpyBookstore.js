var maxSatisfied = function(customers, grumpy, minutes) {
    let currSum = 0;
    for (let i = 0; i < customers.length; i++) {
        if (grumpy[i] == 0) {
            currSum += customers[i];
        }
    }
    //now make a window of size minutes
    let j = 0;
    let sol = currSum;
    console.log(currSum)
    for (let i = 0; i < customers.length; i++) {
        if (customers[i] === 1) {
            currSum += customers[i];
        }

        while ((i - j + 1 ) > minutes) {
            if (grumpy[j] === 1) {
                currSum -= customers[j];
            }
            j++;
        }
        
        sol = Math.max(currSum, sol);
    }
    return sol;
};

var maxSatisfied2 = function(customers, grumpy, X) {
    let totalSatisfaction = 0;
    for (let i = 0; i < customers.length; i++) if (!grumpy[i]) totalSatisfaction += customers[i];
    
    
    // Handle some easy edge cases
    if (X === 0) return totalSatisfaction;
    if (customers.length < X) return customers.reduce((acc, current) => acc + current, 0);
    
    
    // Use a sliding window of size X including customers that
    // would have been previously exluded when they were grumpy
    
    let slidingWindowSum = totalSatisfaction;
    let maxSum = totalSatisfaction;
    let currentEndPosition = -1;
    
    while (currentEndPosition < customers.length - 1) {
        currentEndPosition += 1;
        const previousStartPosition = currentEndPosition - X;
        
        if (previousStartPosition >= 0 && grumpy[previousStartPosition]) slidingWindowSum -= customers[previousStartPosition];
        if (grumpy[currentEndPosition]) slidingWindowSum += customers[currentEndPosition];
        
        maxSum = Math.max(slidingWindowSum, maxSum);
    }
    
    return maxSum;
};