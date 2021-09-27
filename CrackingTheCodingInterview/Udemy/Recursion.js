function recFactorial(x) {
    if (x <= 1) {
        return 1;
    } else {
        return x * recFactorial(x-1);
    }
    //this has space O(N)
}