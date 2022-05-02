var strStr = function(haystack, needle) {
    if (needle === "") return 0;
    let needleLen = needle.length;
    for (let i = 0; i < haystack.length-needleLen+1; i++) {
       // console.log(haystack.substring(i, i+needleLen));
        if (haystack.substring(i, i+needleLen) == needle) {
            return i;
        }
    }
    return -1;
};