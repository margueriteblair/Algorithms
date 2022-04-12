var letterCombinations = function(digits) {
    const mappings = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"];
    if (digits.length === 0) return [];
    let res = [];
    
    function _backtrack(curr, index) {
        if (curr.length === digits.length) {
            res.push(curr.join(""));
            return;
        }
        
        let digit = +digits[index];
        let mapping = mappings[digit];
        
        for (let i = 0; i < mapping.length; i++) {
            curr.push(mapping[i]);
            _backtrack(curr, index+1);
            curr.pop();
        }
    }
    
    _backtrack([], 0);
    return res;
};