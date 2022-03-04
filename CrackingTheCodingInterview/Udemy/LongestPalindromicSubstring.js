function longestPalindromicSubstring(string) {
    // Write your code here.
      let longest = "";
      for (let i = 0; i < string.length; i++) {
          for (let j = i+1; j <= string.length; j++) {
              console.log(string.substring(i, j))
              if (isPalindrome(string.substring(i, j))) {
                  if (string.substring(i, j).length > longest.length) {
                      longest = string.substring(i, j);
                  }
              }
          }
      }
      return longest;
  }
  
  function isPalindrome(str) {
      let i = 0;
      let j = str.length-1;
      while (i < j) {
          if (str[i] != str[j]) {
              return false;
          }
          i++;
          j--;
      }
      return true;
  }