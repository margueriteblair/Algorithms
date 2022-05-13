function caesarCipherEncryptor(string, key) {
    // Write your code here.
      //String.fromCharCode((c.charCodeAt(0)-65 + key ) % 26 + 65))
      const charArr = string.split("");
      for (let i = 0; i < charArr.length; i++) {
          charArr[i] = String.fromCharCode((charArr[i].charCodeAt(0)-97+key) % 26 + 97);
      }
      
      return charArr.join("");
  }