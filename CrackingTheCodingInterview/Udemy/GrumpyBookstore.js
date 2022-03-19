var maxSatisfied = function(customers, grumpy, minutes) {
    let currentSatisfied = 0;
    for (let i = 0; i < customers.length; i++) {
        if (grumpy[i] === 0) {
            currentSatisfied += customers[i];
        }
    }
    
    let max = currentSatisfied;
    //now we need to create our window scenario
    let j = 0;
    for (let i = 0; i < customers.length; i++) {
        if (grumpy[i] == 1) {
            currentSatisfied += customers[i];
        }
        
        while (i - j + 1 > minutes) {
            if (grumpy[j] == 1) {
                currentSatisfied -= customers[j];
            }
            j++;
        }
        
        max = Math.max(max, currentSatisfied);
    }
    return max;
};