package codility2;

public class VoraciousFish {
    public static void main(String[] args) {
        
    }

    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        int survivors = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            } else {
                int weightDown = stack.isEmpty() ? 0 : stack.pop();
                while (weightDown != 0 && weightDown < A[i]) {
                    weightDown = stack.isEmpty() ? 0 : stack.pop();
                }
                if (weightDown == 0) {
                    survivors++;
                } else {
                    stack.push(weightDown);
                }
            }
        }
        return survivors + stack.size();
    }
}