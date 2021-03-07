public class BinaryString {
    public static void main(String[] args) {
        
    }

    public String addBinary(String a, String b) {
        int a2 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c = a2 + b2;
        String str = Integer.toBinaryString(c);
        return str;
    }
}