public class Kangaroos {
    public static void main(String[] args) {
        
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 > x2 && v1 >= v2) {
            return "NO";
        } else if (x2 > x1 && v2 >= v1) {
            return "NO";
        }
        
        if (x1 < x2) {
            while (x1 <= x2) {
                x1 += v1;
                x2 += v2;
                if (x1 == x2) return "YES";
            }
        }
        
        if (x2 < x1) {
            while (x2 <= x1) {
                x1 += v1;
                x2 += v2;
                if (x1 == x2) return "YES";
            }
        }
        
        return "NO";


    }
}