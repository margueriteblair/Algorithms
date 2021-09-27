function recFactorial(x) {
    if (x <= 1) {
        return 1;
    } else {
        return x * recFactorial(x-1);
    }
    //this has space O(N)
}

function tailRecursion(x, totalSoFar = 1) {
    if (x === 0) {
        return totalSoFar;
    } else {
        return tailRecursion(x-1, totalSoFar*x);
    }
    //this has space O(1)
}
//some languages don't support tail recursion, js cannot actually implement tail recursion