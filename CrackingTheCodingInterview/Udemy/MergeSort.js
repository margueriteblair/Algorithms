function mergeSort(arr) {
    if (arr.length == 1) {
        return arr;
    }

    const length = arr.length;
    const middle = Math.floor(length/2);
    const left = arr.slice(0, middle);
    const right = arr.slice(middle);

    return merge(mergeSort(left), mergeSort(right));
}