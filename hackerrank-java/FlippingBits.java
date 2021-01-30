public class FlippingBits {
    public static void main(String[] args) {
        
    }

    static long flippingBits(long n) {
        String bin1 = Integer.toBinaryString((int)n);
        String bin32Bit = String.format("%32s", bin1).replaceAll(" ", "0"); 
        char[] arr = bin32Bit.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                arr[i] = '0';
            } else {
                arr[i] = '1';
            }
        }
        String binFlipped = String.valueOf(arr);
        long output = Long.parseLong(binFlipped, 2);
        return output;

    }
}