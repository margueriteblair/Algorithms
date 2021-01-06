public int solution(int[] A) {
    int consecSize = 0;
    int candidate = 0;
    for (int item: A) {
        if (consecSize == 0) {
            candidate = item;
            consecSize++;
        } else if (candidate == item) {
            consecSize++;
        } else {
            consecSize--;
        }
    }

    int occurance = 0;
    int index = 0; //this will be the index of the leader in our array
    for (int i = 0; i < A.length; i++) {
        if (candidate == A[i]) {
            occurance++;
            index = i;
        }
    }
    return occurance > A.length/2 ? index : -1;
}