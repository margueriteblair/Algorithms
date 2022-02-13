function sum(node) {
    if (!node) {
      return 0;
    }
    let currSum = node.value;
    return currSum + sum(node.next);
}