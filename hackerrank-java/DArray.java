public class DArray {
    public static void main(String[] args) {
       System.out.println(hasZero(0));
       System.out.println(hasZero(88));

    }

    static boolean hasZero(int num) {
        int rem;
        if (num == 0) return true;
        while (num > 0) {
            rem = num % 10;
            if (rem == 0)
                return true;
            num = num / 10;
        }
        return false;
    }
}