package codility2;

public class LeftRotation {
    public static void main(String[] args) {
        
    }

    //[1, 2, 3, 4, 5] --> [5, 1, 2, 3, 4]
    // 0, 1, 2, 3, 4 --> 4, 0, 1, 2, 3
    static int[] rotLeft(int[] a, int d) {
        int[] B = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            B[i] = a[(i+d)%a.length]; 
        }
        return B;
    }
}