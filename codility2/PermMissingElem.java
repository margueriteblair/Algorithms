public class PermMissingElem {
    public static void main(String[] args) {
        solution(new int[] {1,2, 3, 5});
    }

    public static int solution(int[] A) {
        int N = A.length+1; //+1 b/c one is missing
        int totalSum = (int) (Math.pow(N, 2)+ N)/2;
        int localSum = 0;
        for (int num : A) {
            localSum += num;
        }
        return totalSum - localSum;
    }
}