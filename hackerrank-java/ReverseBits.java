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

    public int reverseBits(int n) {
    	int result = 0;
		for (int i = 0; i < 32; i++) {

			result = result << 1;
			int bit=Math.abs(n%2);
			if (bit == 1) {
				result++;
			}

			n = n >> 1;

		}
		return result;
    
    }
}