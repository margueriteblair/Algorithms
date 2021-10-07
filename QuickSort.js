const quickSort = function(array, left, right) {
    if (left < right) {
        let partitionIdx = partition(array,left, right);
        quickSort(array, left, partitionIdx-1);
        quickSort(array, left, partitionIdx+1);
    }
}

const partition = function(array, left, right) {
    const pivot = array[right];
    let partitionInd = left;
    for (let j = left; j < right; j++) {
        if (array[j] < pivot) {
            swap(array, partitionInd, j);
            partitionInd++;
        }
    }
    swap(array, partitionInd, right);
}

const swap = function() {
    
}
