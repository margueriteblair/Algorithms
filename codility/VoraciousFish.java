public class VoraciousFish {
    public static void main(String[] args) {
        
    }
    public int solution(int[] A, int[] B) {
        Stack<Integer> stacky = new Stack<>();
        int survivors = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1) {
                stacky.push(A[i]);
                A[i] = 0;
            } else if (B[i] == 0) {
                if (!stacky.isEmpty() && stacky.peek() < A[i]) {
                    stacky.pop();
                } else if (!stacky.isEmpty() && stacky.peek() > A[i]) {
                    A[i] = 0;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                survivors++;
            }
        }
        // System.out.println(Arrays.toString(A));
        return survivors;
    }

    public int solution2(int[] A, int[] B) {
        Stack<Integer> stacky = new Stack<>();
        int survivors = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stacky.push(A[i]);
            } else {
                int weighDown = stacky.isEmpty() ? -1  : stacky.pop();
                while (weighDown != -1 && weighDown < A[i]) {
                    weighDown = stacky.isEmpty() ? -1  : stacky.pop();
                }
                if (weighDown == -1) {
                    survivors++;
                } else {
                    stacky.push(weighDown);
                }
            }
        }
        return survivors+stacky.size();
    }
}