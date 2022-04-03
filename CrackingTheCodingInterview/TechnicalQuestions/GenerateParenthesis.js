var generateParenthesis = function(n) {
    let res = [];
    var _backtrack = function(curr, res, open, close, max) {
        if (curr.length === max * 2) {
            res.push(curr);
            return;
        }
        
        if (open < max) {
            curr += "(";
            _backtrack(curr, res, open+1, close, max);
            curr = curr.substring(0, curr.length-1);
        }
        
        if (close < open) {
            curr += ")";
            _backtrack(curr, res, open, close+1, max);
            curr = curr.substring(0, curr.length-1);
        }
    }
    
    _backtrack("", res, 0, 0, n);
    return res;
};

var generateParenthesis2 = function(n) {
    
    let res=[];
    let _backtrack = function(curr, res, open, close, max) {
        if (curr.length === max*2) {
            res.push(curr);
            return;
        }
        
        if (open < max) {
            _backtrack(curr+"(", res, open+1, close, max);
        }
        
        if (close < open) {
            _backtrack(curr+")", res, open, close+1, max);
        }
    }
    
    _backtrack("",res,0,0, n);
    return res;
};