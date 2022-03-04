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


//following two functions go from O(N^2), and O(1) space
function longestPalindromicSubstring2(string) {
    currentLongest = [0, 1]
    for (let i = 1; i < string.length; i++) {
        let odd = getLongestPalindromeFrom(string, i-1, i+1); //palindrome of odd length
        let even = getLongestPalindromeFrom(string, i-1, i);
        let longest = even[1] - even[0] > odd[1] - odd[0] ? even : odd; //remember, the even and odd variables are tuples
        currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
    }
    return string.substring(currentLongest[0], currentLongest[1]);
}

function getLongestPalindromeFrom(string, left, right) {
    while (left >= 0 && right < string.length) {
        if (string[left] !== string[right]) break;
        left--;
        right++;
    }
    return [left+1, right];
}