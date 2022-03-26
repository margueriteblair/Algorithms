var lowestCommonAncestor = function(p, q) {
    let stackP = [];
    let stackQ = [];
    if (p.parent == q.parent) return p.parent;
    while (p != null) {
        stackP.push(p);
        p = p.parent;
    }
    
    while (q != null) {
        stackQ.push(q);
        q = q.parent;
    }
    
    console.log(stackP)
    console.log(stackQ)
    let currLCA = stackP[stackP.length-1] || stackQ[stackQ.length-1];
    while (stackP.length > 0 && stackQ.length > 0) {
        p = stackP.pop();
        q = stackQ.pop();
        if (p == q) {
            currLCA = p;
        }
    }
    
    return currLCA;
};