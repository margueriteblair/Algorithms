public class ModifiedKaprekar {
    public static void main(String[] args) {
        
    }

    static void kaprekarNumbers(int p, int q) {
        int count = 0;
        for (int i = p; i <= q; i++) {
            if (isModified(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        if (count == 0) {
            System.out.println("INVALID RANGE");
        }

    }
    
    public static boolean isModified(int num) {
        if (num == 1) return true;
        String n = String.valueOf(num);
        int d = n.length();
        String n2 = String.valueOf((long) Math.pow(num, 2));
        String r = n2.substring(n2.length()-d, n2.length());
        String l = n2.substring(0, n2.length()-d);
        try {
            if (Integer.parseInt(l) + Integer.parseInt(r) == num) {
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
        return false;
    }
}