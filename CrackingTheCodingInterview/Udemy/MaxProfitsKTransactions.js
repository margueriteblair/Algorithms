function maxProfitWithKTransactions(prices, k) {
    // Write your code here.
      //given an array of positive integers representing the prices of a single
      //stock on various days
      //you're allowed to make k transactions
      //rows will be the number of transactions
      //columns will be the prices of the stocks
      //we've got two things that are changing here:
          //daily prices and our k number of transactions
      if (!prices.length) return 0;
      //make our 2D array
      let profits = []
      for (let t = 0; t < k+1; t++) {
          profits.push(new Array(prices.length).fill(0))
      }
      for (let t = 1; t < k + 1; t++) {
          let maxThusFar = -Infinity; //hi
          for (let d = 1; d < prices.length; d++) {
              //d is the day, t is the time
              maxThusFar = Math.max(maxThusFar, profits[t-1][d-1] - prices[d-1]);
              profits[t][d] = Math.max(profits[t][d-1], maxThusFar + prices[d])
          }
      }
      console.log(profits)
      return profits[k][prices.length-1];
  }