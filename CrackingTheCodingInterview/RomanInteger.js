var romanToInt = function(s) {
    let integer = 0;
    let map = new Map();
    map.set("I", 1)
    map.set("V", 5)
    map.set("X", 10)
    map.set("L", 50)
    map.set("C", 100)
    map.set("D", 500)
    map.set("M", 1000)
    for (let i = 0; i < s.length; i++) {
        if (s[i] == 'I' && s[i+1] == 'V') {
            integer += 4;
            i++;
        } else if (s[i] == 'I' && s[i+1] == 'X') {
            integer += 9;
            i++;
        } else if (s[i] == 'X' && s[i+1] == 'L') {
            integer += 40;
            i++;
        } else if (s[i] == 'X' && s[i+1] == 'C') {
            integer += 90;
            i++;
        } else if (s[i] == 'C' && s[i+1] == 'D') {
            integer += 400;
            i++;
        } else if (s[i] == 'C' && s[i+1] == 'M') {
            integer += 900;
            i++;
        } else {
            integer += map.get(s[i]);
        }
    }
    return integer;
};