function getNthFib(n) {
    // Write your code here.
      let fib = [0, 1]
      if (n == 1) return 0;
      if (n == 2) return 1;
      //dyanmic programming is bottom up
      let count = 1;
      while (count != n) {
          let tmp = fib[0];
          fib[0] = fib[1];
          fib[1] = tmp + fib[1];
          count++;
      }
      console.log(fib);
      return fib[0];
  }