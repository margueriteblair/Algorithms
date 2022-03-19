var lengthOfLongestSubstringTwoDistinct = function(s) {
    let map = new Map();
    let longest = 0;
    let j = 0; //window end, nearest to the start of the string
    for (let i = 0; i < s.length; i++) {
        map.set(s[i], map.get(s[i])+1 || 1);
        
        if (map.size <= 2) {
            longest = Math.max(longest, i - j + 1); //window size is the second arg
        }
        
        while (map.size > 2) {
            map.set(s[j], map.get(s[j])-1);
            if (map.get(s[j]) === 0) {
                map.delete(s[j]);
            }
            j++;
        } 
    }
    return longest;
};