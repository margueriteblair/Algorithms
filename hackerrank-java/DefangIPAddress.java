public class DefangIPAddress {
    public static void main(String[] args) {
        
    }

    public String defangIPaddr(String address) {
        String res = address.replace(".", "[.]");
        return res;
    }
}