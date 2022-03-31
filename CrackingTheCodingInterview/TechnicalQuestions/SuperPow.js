var superPow = function(a, b) {
    let realB = Number(b.join(""));

    let expo;
    if (realB % 2 === 0) {
        expo = boilDown(realB, a);
    } else{
        expo = boilDown(realB-1, a) * (a % 1337);
    }
    //console.log(expo)
    return expo;
    
};

var boilDown = function(realB, a) {
    if (realB == 1) {
        return a % 1337;
    }
    
    return boilDown(realB/2, a) * boilDown(realB / 2, a);
}