import java.util.Arrays;

public class largestNumsInArray {
    public static void main(String[] args) {
        largestNum(new int[][] {{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}});
    }

    public static void largestNum(int[][] arr) {
        int[] largNumsArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int bigNum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > bigNum) {
                    bigNum = arr[i][j];
                }
                largNumsArr[i] = bigNum;
            }
        }
        System.out.println(Arrays.toString(largNumsArr));
    }
}