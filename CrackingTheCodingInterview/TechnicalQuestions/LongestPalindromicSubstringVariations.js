//1. isPalindrome()
function isPalindrome(str) {
    let s = str.replaceAll("[^A-Za-z0-9]", "");
    let i = 0;
    let j = s.length-1;
    while (i < j){
      if (s[i] != s[j]) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  
  }
  
  //2. Longest palindromic palindromic substring with a helper function
  
  function longestPalindromicSubstring(string) {
    let currLongest = [0, 1] //assumes we have at least a char
    for (let i = 1; i < string.length; i++) {
      let odd = getLongest(string, i-1, i+1);
      let even = getLongest(string, i-1, i);
      let longest = even[1] - even[0] > odd[1] - odd[0] ? even : odd;
      let currLongest = currLongest[1] - currLongest[0] > longest[1] - longest[0];
    }
    return string.substring(currLongest[0], currLongest[1]);
  }
  
  function getLongest(string, start, end) {
    while (start >= 0 && end < string.length) {
      if (string[left] != string[right]) {
        break;
      }
      start--;
      end++;
    }
    return [start+1, end]
  }
  
  //longest palindromic mountainous subsequence
  function longestPalindromicMountain(arr) {
    if (!arr.length) return [];
    let longest = [0, 1]
    for (let i = 1; i < arr.length; i++) {
      let curr = getLongest2(arr, i);
      longest = longest[1]-longest[0] > curr[1] - curr[0] ? longest : curr;
    }
    return arr.slice(longest[0], longest[1]);
  }
  
  function getLongest2(arr, index) {
    let i = index;
    let j = index;
    while (i > 0 && j < arr.length-1) {
      if (arr[i] <= arr[i-1] || arr[j] <= arr[j+1]) {
        j++; //so that its inclusive
        break;
      }
      j++;
      i--;
    }
    return [i, j]
  }
  
  console.log(longestPalindromicMountain([1, 0, 2, 5, 3, 1, 4, 6, 1]));
  console.log(longestPalindromicMountain([5, 2, 5, 3, 1])); //should return [2,5,3]
  
  function longestSymmetricSubsequence(arr) {
    let longest = [0, 1]
    for (let i = 1; i < arr.length; i++) {
      let curr = getLongest3(arr, i);
      longest = longest[1] - longest[0] > curr[1] - curr[0] ? longest : curr;
    }
    return arr.slice(longest[0], longest[1]);
  }
  
  function getLongest3(arr, index) {
    let i = index-1;
    let j = index+1;
    while (i >= 0 && j < arr.length) {
      if ((arr[i] + arr[j]) != arr[index]) break;
      i--
      j++;
    }
    return [i+1, j];
  }
  console.log(longestSymmetricSubsequence([1, 1, 5, 5, 0, 4, 4, 6, 1]));
  //[1, 1, 5, 5, 0, 4, 4, 6, 1] returns [1, 1, 5, 5, 0, 4, 4]