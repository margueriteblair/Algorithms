public class ReverseBits {
    public int reverseBits(int n) {
        String result = Integer.toBinaryString(n);
        String resultWithPadding = String.format("%32s", result).replaceAll(" ", "0");
        
        String reverse = "";
        for (int i = resultWithPadding.length()-1; i >= 0; i--) {
            reverse += resultWithPadding.charAt(i);
        }
        return Integer.parseInt(reverse, 2);
    }
}