function biggerIsGreater(w) {
    // Write your code here
    let arr = Array(...w);
    let i = arr.length-1;
    while (i > 0 && arr[i] <= arr[i-1]){
        i--;
    }
    if (i == 0) return "no answer";
    let j = arr.length-1;
    while (arr[j] <= arr[i-1]) {
        j--;
    }
    [arr[j], arr[i-1]] = [arr[i-1], arr[j]];
    return (arr.slice(0, i).concat(arr.slice(i, arr.length).sort()).join(""));
}