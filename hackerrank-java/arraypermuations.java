static String twoArrays(Integer k, Integer[] A, Integer[] B) {
    Arrays.sort(A);
    Arrays.sort(B, Collections.reverseOrder());
    for (int i = 0; i < A.length; i++) {
        if (A[i] + B[i] < k) {
            return "NO";
        }
    }
    return "YES";

//note for this program to work, you'll need to change all the instances of primitive int to Integer
//you cannot directly sort in reverse order with Arrays.sort(B, Collections.reverseOrder()) with a primitive type array!
}
