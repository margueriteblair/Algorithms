var minWindow = function(s, t) {
    if (s.length < t.length || s.length === 0 || t.length === 0) return "";
    let tMap = new Map();
    for (const c of t) {
        tMap.set(c, tMap.get(c) + 1 || 1);
    }
    let windowStart = 0;
    let required = tMap.size; //number of unique chars in t that need to be in the required window
    let minSubstring = "";
    let l = 0, r = 0;
    let formed = 0;
    let windowCounts = new Map(); //hm that keeps count of all the unique chars in the current window
    let ans = [-1, 0, 0] //ans list of the form [windowLen, left, right]
    
    while (r < s.length) {
        let c =s[r]
        let count = windowCounts.get(c) || 0;
        windowCounts.set(c, count+1);
        
        if (tMap.has(c) && windowCounts.get(c) === tMap.get(c)) {
            formed++;
        }
        
        while (l <= r && formed === required) {
            c = s[l];
            if (ans[0] === -1 || r-l+1 < ans[0]) {
                ans[0] = r - l + 1;
                ans[1] = l;
                ans[2] = r;
            }
            
            windowCounts.set(c, windowCounts.get(c) -1);
            if (tMap.has(c) && windowCounts.get(c) < tMap.get(c)) {
                formed--;
            }
            l++;
        }
        r++;
    }
    return ans[0] == -1 ? "" : s.substring(ans[1], ans[2]+1);
};