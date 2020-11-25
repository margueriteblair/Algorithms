public class DArray {
    public static void main(String[] args) {
       System.out.println(hasZero(90));
       System.out.println(hasZero(88));

    }

    static boolean hasZero(int num) {
        int rem;
        while (num > 0) {
            rem = num % 10;
            if (rem == 0)
                return true;
            num = num / 10;
        }
        return false;
    }
}