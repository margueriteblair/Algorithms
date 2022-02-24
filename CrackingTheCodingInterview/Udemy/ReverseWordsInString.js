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