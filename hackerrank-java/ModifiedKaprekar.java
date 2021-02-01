public class ModifiedKaprekar {
    public static void main(String[] args) {
        
    }

    static void kaprekarNumbers(int p, int q) {
        for (int i = p; i <= q; i++) {
            if (isModified(i)) {
                System.out.print(i + " ");
            }
        }

    }
    
    public static boolean isModified(int num) {
        if (num == 1) return true;
        String n = String.valueOf(num);
        int d = n.length();
        String n2 = String.valueOf((int) Math.pow(num, 2));
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