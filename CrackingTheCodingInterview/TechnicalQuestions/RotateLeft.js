function rotateLeft(a, k) {
    let b = new Array(a.length);
    for (let i = 0; i < a.length; i++) {
      if (i - (k % a.length) >= 0) {
        b[i - (k % a.length)] = a[i];
      } else {
        b[a.length - (k % a.length) + i] = a[i];
      }
    }
    return b;
  }
  
  //[1, 2, 3, 4, 5] k = 2 
  //b = [3, 4, 5, 1, 2]
  //(5 - 2 + 3) % a.length
  //b[0] = a[3]
  //a.length - 
  function rotateLeft2(a, k) {
    let b = new Array(a.length);
    for (let i = 0; i < a.length; i++) {
        b[(a.length - (k % a.length) + i) % a.length] = a[i];
    }
    return b;
  }