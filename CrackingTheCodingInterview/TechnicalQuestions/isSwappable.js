function isSwappable(s, goal) {
    if (s.length != goal.length || s.length < 2 || goal.length < 2) return false;
    let charMap = new Map();
    let maxCharCount = 1;
    for (const c of s) {
      charMap.set(c, charMap.get(c)+1 || 1);
      //s = cat goal = tac
      //{c = 1, a = 1, t = 1}
      //if (charMap.get(c) > 1) maxCharCount = 2;
    }
    if (charMap.size != goal) { //this is only if they're the same
      maxCharCount = 2;
    }
    for (const goalChar of goal) {
      console.log(goalChar);
      if (charMap.has(goalChar)) {
        charMap.set(goalChar, charMap.get(goalChar)-1);
        if (charMap.get(goalChar) == 0) {
          charMap.delete(goalChar);
        }
      } else {
        return false;
      }
    }
  
  
    //catch base cases of empty strs, or one letter
    //then generate char map of one string and compare to goal string
  
    let counterMismatch = 0;
    for (let i = 0; i < s.length; i++) {
      if (s[i] != goal[i]) {
        counterMismatch++;
      }
    }
    return counterMismatch <= 2 && maxCharCount <= 1;
  }
  
  // console.log(isSwappable("banana", "baanna"), "expects true")
  // console.log(isSwappable("banana", ""), "expects false")
  // console.log(isSwappable("", ""), "expects false")
  // console.log(isSwappable("e", "r"), "expects false")
  // console.log(isSwappable("banana", "panana"), "expects false")
  console.log(isSwappable("cat", "tac"), "expects true")
  console.log(isSwappable("cat", "cat"), "expect false")