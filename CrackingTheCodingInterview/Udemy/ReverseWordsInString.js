function reverseLettersInWord(str) {
    let arr = str.trim().replaceAll("\\s+", " ").split(" ");
    for (let i= 0; i < arr.length; i++) {
        let curr = arr[i].split("");
        let j = 0;
        let k = curr.length-1;
        
        while (j < k) {
            //console.log(curr[j], curr[k]);
            let tmp = curr[j];
            curr[j] = curr[k];
            curr[k] = tmp;
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