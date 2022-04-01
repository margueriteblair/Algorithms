package CrackingTheCodingInterview;

public class PowXN {
    public static void main(String[] args) {
        
    }

    public double myPow(double x, int n) {
        double expo = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            if (n > 0) {
               expo *= x; 
            } else if (n < 0) {
                expo = expo / x;
            } else {
                return 1;
            }
            
        }
        
        return expo;
    }
}