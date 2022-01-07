public class MergeSort {
    public static void main(String[] args) {
        
    }

    public static int[] mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }

        int midpoint = len/2;
        int[] leftHalf = new int[midpoint];
        int[] rightHalf = new int[len-midpoint];

        for (int i = 0; i < midpoint; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = midpoint; i < len; i++) {
            rightHalf[i-midpoint] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);
        System.out.println(arr);
        return arr;

        //merge here again
    }

    public static void merge(int[] inputArr, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                inputArr[k] = left[i];
                i++;
            } else {
                inputArr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            inputArr[k] = left[i];
            i++;
        }

        while (j < rightLength) {
            inputArr[k] = right[j];
            j++;
        }
    }
}