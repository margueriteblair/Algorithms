function encode(columnNum) {
    let res = "";
    const mappings = ["A", "B", "C", 'D', "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U","V","W","X", "Y", "Z"]
    while (columnNum > 0) {
      let curr = columnNum % 26;
      res = mappings[curr-1] + res;
      columnNum = Math.floor(columnNum/26);
    }
  
    return res;
  
  }