const isAlmostPalindrome = function(s) {
    let left = 0
    let right = s.length-1
    while (left < right) {
        if (s[left] !== s[right]) {
            return validSubPalindrome(s, left+1, right) || validSubPalindrome(s, left, right-1);
        }
        right--;
        left++;
    }
    return true;
}

const validSubPalindrome = function(s, start, end) {
    while (start < end) {
        if (s[start] !== s[end]) {
            return false;
        }
        start++;
        end--;
    }
    return false;
}