function generateDocument(characters, document) {
    // Write your code here.
      let charsMap = new Map();
      for (const c of characters) {
          charsMap.set(c, charsMap.get(c)+1 || 1);
      }
      
      for (const c of document) {
          if (!charsMap.has(c) || charsMap.get(c) === 0) {
              return false;
          } else {
              charsMap.set(c, charsMap.get(c)-1);
          }
      } 
    return true;
  }