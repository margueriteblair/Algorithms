package CrackingTheCodingInterview.TechnicalQuestions;

public class MinSwaps {
    public static void main(String[] args) {
        
    }

    static int minimumSwaps(int[] arr) {
        //needs to be 1...n
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i+1)) {
                int j = i;
                while (arr[j] != (i+1)) j++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                swaps++;
            }
        }
        return swaps;
    }
}