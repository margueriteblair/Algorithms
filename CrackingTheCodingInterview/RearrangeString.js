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
    console.log(mostFrequency)
    console.log(mostFrequentChar)
    if (mostFrequency > (s.length+1)/2) return "";
    let res = new Array(s.length).fill("");
    let i = 0;
    while (mostFrequency >= 0 && i < s.length) {
        res[i] = mostFrequentChar;
        mostFrequency--
        i+=2;
    }
    i = 1;
    for (let j = 0; j < s.length; j++) {
        if (s[j] !== mostFrequentChar) {
            res[i] = s[j];
            i+=2;
        }
        
    }
    return (res.join(""))
};