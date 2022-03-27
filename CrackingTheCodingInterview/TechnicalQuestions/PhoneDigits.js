var letterCombinations = function(digits) {
    if (digits.length === 0) return [];
    const mapping = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"];
    
    //we need to backtrack
    const res = [];
    
    const _backtrack = function(curr, index) {
        if (curr.length === digits.length) {
            res.push(curr.join(""));
            return;
        }
        
        const digit = +digits[index]; //curr digit of our string
        const letters = mapping[digit];
        
        for (const letter of letters) {
            curr.push(letter);
            _backtrack(curr, index+1);
            curr.pop();
        }
    }
    
    _backtrack([], 0);
    return res;
};