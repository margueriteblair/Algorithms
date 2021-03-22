public class ReverseBits {
    public int reverseBits(int n) {
        String result = Integer.toBinaryString(n);
        String resultWithPadding = String.format("%32s", result).replaceAll(" ", "0");
        
        String reverse = "";
        for (int i = resultWithPadding.length()-1; i >= 0; i--) {
            reverse += resultWithPadding.charAt(i);
        }
        if (n < 0) {
            String end = "-" + reverse;
            return Integer.parseInt(end, 2);
        } else {
            return Integer.parseInt(reverse, 2);
        }  
    }
}