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