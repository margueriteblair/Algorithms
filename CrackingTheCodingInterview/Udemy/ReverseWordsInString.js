function reverseLettersInWord(str) {
    let arr = str.trim().replaceAll("\\s+", " ").split(" ");
    for (let i= 0; i < arr.length; i++) {
        let curr = arr[i].split("");
        let j = 0;
        let k = curr.length-1;
        
        while (j < k) {
            //console.log(curr[j], curr[k]);
            [curr[j], curr[k]] = [curr[k],curr[j]]
            j++;
            k--;
        }
        arr[i] = curr.join("");
        //console.log(curr.join(""));
    }
    return arr.join(" ");
}

console.log(reverseLettersInWord("Reverse the words in this string"), "expects: esreveR eht sdrow ni siht gnirts");
//regex to replace all non alphanumeric chars: [^a-zA-Z0-9]
function rotateWordsByX(str, k) {
    //rotate all words to the right by k positions
    let arr = str.trim().replaceAll("\\s+", " ").split(" ");
    let res = [];
    for (let i = 0; i < arr.length; i++) {
        res[(i + k) % arr.length] = arr[i];
        
    }
    return res.join(" ");
}

console.log(rotateWordsByX("1 2 3 4 5", 1));
console.log(rotateWordsByX("Gallia est omnis divisa en partes tres", 1));

//rotate the array
//in this variation you'll receive an array of ints, where number 0 represents a word break
//reverse all the elements between the 0's
//[1,2,3,0,4,5,6] => [3,2,1,0,6,5,4]
//[1,2,3,4,5,6] => [6,5,4,3,2,1]
function rotateArray(arr) {
    let chunk = arr.join("").split("0")
    for (let i = 0; i < chunk.length; i++){
        let curr = chunk[i].split("");
        let j = 0, k = curr.length-1;
        while (j < k) {
            [curr[j], curr[k]] = [curr[k], curr[j]];
            j++;
            k--;
        }
        chunk[i] = curr.join("")
    }
    return chunk.join("0").split("").map(Number)
}

console.log(rotateArray([1,2,3,0,4,5,6]))
console.log(rotateArray([1,2,3,4,5,6]))

function reverseLettersInChunks(str, k) {
    let res = "";
    //assume that the string is divisble by k
    //can we assume that theres no spaces, or if there is can we just count that as a letter we're reversing?
    for (let i = 0; i < str.length; i+=k) {
        let curr = str.substring(i, i+k).split("");
        //console.log(curr);
        let j = 0;
        let l = curr.length-1;
        while (j < l) {
            [curr[j], curr[l]] = [curr[l], curr[j]];
            j++;
            l--;
        }
        res += curr.join("");
    }
    return res;
}
console.log(reverseLettersInChunks("abcdef", 2), "badcfe");
console.log(reverseLettersInChunks("abcdef", 3), "cbafed")
console.log(reverseLettersInChunks("abcdefgh", 4), "dcbahgfe");