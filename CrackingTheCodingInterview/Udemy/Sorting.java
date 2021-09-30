package CrackingTheCodingInterview.Udemy;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
    }
    //space O(1)
    //time O(N^2)

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int localMin = arr[i];
            int localMinIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < localMin) {
                    localMin = arr[j];
                    localMinIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = localMin;
            arr[localMinIndex] = tmp;
        }
        System.out.println(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(arr);
    }

    public static int[] mergeSort(int[] arr, int beg, int end) {
        if (arr.length == 1) {
            return arr;
        }

        int length = arr.length;
        int middle = (beg+end)/2;
        mergeSort(arr, beg, middle);
        mergeSort(arr, middle+1, end);
        merge(arr, beg, middle, end);
    }

    private static void merge(int[] arr, int beg, int middle, int end) {
    }
}