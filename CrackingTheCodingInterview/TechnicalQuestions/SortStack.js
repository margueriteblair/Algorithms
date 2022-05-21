function sortStack(stack) {
    // Write your code here.
    let arr = [];
      while (stack.length) {
          arr.push(stack.pop());
      }
      arr.sort((a, b) => a-b);
      return arr;
  }