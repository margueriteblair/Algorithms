static int[] rotLeft(int[] a, int d) {

    int[] arr = new int[a.length];
    for (int i = a.length-1; i >= 0; i--) {
        if ((i-d) >= 0) {
            arr[i-d] = a[i];
        } else {
            arr[a.length-Math.abs(i-d)] = a[i];
        }
    }
    return arr;

}public class leftshiftarray {
    
}