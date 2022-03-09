var lengthOfLongestSubstring = function(s) {
    let i = 0, j = 0;
    let longest = 0;
    let set = new Set();
    while (i < s.length && j < s.length) {
        if (set.has(s[i])) {
            set.delete(s[j]);
            j++;
        } else {
            set.add(s[i]);
            i++;
            longest = Math.max(set.size, longest);
        }
    }
    return longest;
};