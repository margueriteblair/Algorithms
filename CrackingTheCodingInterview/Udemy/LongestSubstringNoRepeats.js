const lengthOfLongestSubstring = function(s) {
    if (s.length <= 1) {
        return s.length;
    }

    let l = 0;

    const seenChars = {}
    let longest = 0;

    for (let r = 0; r < s.length; r++) {
        const currentChar = s[r];
        let prevSeenChar = seenChars[currentChar]
        if (prevSeenChar >= l) {
            l = prevSeenChar++;
        }

        seenChars[currentChar] = r;
        longest = Math.max(longest, r-l+1);
    }
    return longest;
}

console.log(lengthOfLongestSubstring("hello"))

var lengthOfLongestSubstring2 = function(s) {
    let i = 0, j = 0;
    let longest = 0;
    const set = new Set();
    while (i < s.length && j < s.length) {
        if (set.has(s[i])) {
            set.delete(s[j]);
            j++;
        } else {
            set.add(s[i]);
            i++;
            longest = Math.max(longest, set.size);
        }
    }
    return longest;
};