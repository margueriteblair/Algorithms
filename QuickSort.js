const quickSort = function(array, left, right) {
    if (left < right) {
        let partitionIdx = partition(array,left, right);
        quickSort(array, left, partitionIdx-1);
        quickSort(array, left, partitionIdx+1);
    }
}