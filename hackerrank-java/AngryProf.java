public class AngryProf {
    public static void main(String[] args) {
        
    }

    static String angryProfessor(int k, int[] a) {
        int presentCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                presentCount++;
            }
        }
        
        return presentCount >= k ? "NO" : "YES";
    }

}