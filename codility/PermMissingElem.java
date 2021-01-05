import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        missing(new int[] {2, 4, 1, 3, 6});
        missing2(new int[] {2, 4, 1, 3, 6});
        missing(new int[] {2,3, 1,5});
    }
    public static int missing(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) return 0;
        int missing = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i+1) {
                missing = i+1;
            }
        }
        System.out.println(missing);
        return missing;
    }

    public static int missing2(int[] A) {
        //sum{1---n+1}-sum(inputArr)
        int sumInput = 0;
        for (int num : A) {
            sumInput += num;
        }
        int sumSeq = (int)(Math.pow(A.length+1, 2)+A.length+1)/2;
        int missingNum = sumSeq-sumInput;
        System.out.println(missingNum);
        return missingNum;
    }

    public int solution3(int[] A) {
        int seqSum = 0;
        for (int i = 1; i <= A.length+1; i++) {
            seqSum += i;
        }
        int arrSum = 0;
        for (int num : A) {
            arrSum += num;
        }
        int diff = seqSum - arrSum;
        return diff;
    }

}