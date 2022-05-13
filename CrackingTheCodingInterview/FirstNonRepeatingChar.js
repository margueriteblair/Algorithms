function firstNonRepeatingCharacter(string) {
    // Write your code here.
      let map = new Map();
      for (const c of string) {
          map.set(c, map.get(c) + 1 || 1);
      }
      for (let i = 0; i < string.length; i++) {
          if (map.get(string[i]) == 1) return i;
      }
    return -1;
  }