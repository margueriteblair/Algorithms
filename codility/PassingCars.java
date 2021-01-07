public class PassingCars {
    public static void main(String[] args) {
        
    }

    public int solution(int[] A) {
        int passingCount = 0;
        int zeroCount = 0;
        int[] sumsArr = new int[A.length];
        int sum = 0;
        for (int i = 0; i < sumsArr.length; i++) {
            sum += A[i];
            sumsArr[i] = sum;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeroCount++;
            }
        }
        for (int i = A.length-zeroCount; i < A.length; i++) {
            passingCount += sumsArr[i];
        }
        return passingCount;
    }
}