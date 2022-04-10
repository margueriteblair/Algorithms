*/
var reorganizeString = function(s) {
    let charMap = new Map();
    let mostFrequency = 0;
    let mostFrequentChar = '';
    for (let char of s) {
        charMap.set(char, charMap.get(char)+1 || 1);
        if (charMap.get(char) > mostFrequency) {
            mostFrequentChar = char;
            mostFrequency = charMap.get(char);
        }
    }

    if (mostFrequency > (s.length+1)/2) return "";
    let res = new Array(s.length).fill("");
    let i = 0;
    while (mostFrequency > 0 && i < s.length) {
        res[i] = mostFrequentChar;
        mostFrequency--
        i+=2;
    }
    
    for (let c of charMap.keys()) {
        while (charMap.get(c) > 0 && c != mostFrequentChar) {
            if (i >= s.length) i = 1;
            res[i] = c;
            charMap.set(c, charMap.get(c)-1);
            i +=2;
        }
    }
        
    return (res.join(""))
};