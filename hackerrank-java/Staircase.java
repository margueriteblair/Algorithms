public class Staircase {
    public static void main(String[] args) {
        
    }

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String str = "";
            for (int j = 0; j < (n-i); j++) {
                str += " ";
            }
            for (int k = 1; k <= i; k++) {
                str += "#";
            }
            System.out.println(str);   
        }
    }
}