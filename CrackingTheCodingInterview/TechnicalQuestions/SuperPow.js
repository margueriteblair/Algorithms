var superPow = function(a, b) {
    let realB = 0;
    for (let i = 0; i < b.length; i++) {
        realB += b[i] * (Math.pow(10, i));
    }
    
    let expo;
    if (realB % 2 === 0) {
        expo = boilDown(realB, a);
    } else{
        expo = boilDown(realB-1, a) * (a % 1337);
    }
    
    return expo;
    
};

var boilDown = function(realB, a) {
    if (realB === 1) {
        return a % 1337;
    }
    
    return a % 1337 * boilDown(realB / 2, a);
}