public class ReverseBits {
    public int reverseBits(Integer n) {
        String norm = n.toString();
        String reverse = "";
        System.out.println(n);
        for (int i = norm.length()-1; i >= 0; i--) {
            reverse += norm.charAt(i);
        }
        System.out.println(reverse);
        
        return 1;
    }
}