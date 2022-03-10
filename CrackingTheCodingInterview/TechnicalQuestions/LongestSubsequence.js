function lcsRecursive(a, b, i = 0, j = 0) {
    if (i === a.length || j === b.length) {
      return "";
    }
    
    if (a[i] === b[j]) {
      return a[i] + lcsRecursive(a, b, i + 1, j + 1);
    } else {
      const r1 = lcsRecursive(a, b, i + 1, j);
      const r2 = lcsRecursive(a, b, i, j + 1);
      return r1.length > r2.length ? r1 : r2;
    }
  }w