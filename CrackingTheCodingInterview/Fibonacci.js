var fib = function(n) {
    let fibs = [0, 1];
    if (n == 0) return 0;
    if (n == 1) return 1;
    //dynamic programming is bottom up
    let i = 2;
    while (i <= n) {
        let tmp = fibs[0];
        fibs[0] = fibs[1];
        fibs[1] = tmp + fibs[1];
        i++;
    }
    return fibs[1];
}