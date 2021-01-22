public class PassingCars {
    public static void main(String[] args) {
        
    }

    public static int solution(int[] A) {
        int passingCars = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        // System.out.println(sum);
        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
            if (A[i] == 0) {
                passingCars += sum;
            }
        }
        return passingCars;
    }
}