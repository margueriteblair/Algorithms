public class SaveThePrisoner {
    public static void main(String[] args) {
        
    }

    static int saveThePrisoner(int n, int m, int s) {
        int remainder = (s+m-2)%n+1;
        return remainder;

    }
}