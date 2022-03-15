var lengthOfLongestSubstringTwoDistinct = function(s) {
    //2 is hardcodes
    let charMap = new Map();
    let j = 0;
    let longest = 0;
    for (let i = 0; i < s.length; i++) {
        charMap.set(s[i], charMap.get(s[i])+1 || 1);
        if (charMap.size <= 2) {
            longest = Math.max(longest, i-j+1);
        }
        while (charMap.size > 2) {
            let count = charMap.get(s[j]);
            //count = count - 1;
            charMap.set(s[j], --count);
            if (count == 0) charMap.delete(s[j]);
            j++;
        }
    }
    return longest;
};