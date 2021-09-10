const lengthOfLongestSubstring = function(s) {
    if (s.length <= 1) {
        return s.length;
    }

    let l = 0;

    const seenChars = {}
    let longest = 0;

    for (let r = 0; r < s.length; r++) {
        const currentChar = s[r];
        const prevSeenChar = seenChars[currentChar]
        if (prevSeenChar >= l) {
            l = prevSeenChar++;
        }

        seenChars[currentChar] = r;
        longest = Math.max(longest, r-l+1);
    }
    return longest;
}