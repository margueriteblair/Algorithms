public class ShuffleString {
    public static void main(String[] args) {
        
    }

    public String restoreString(String s, int[] indices) {
        String[] resArr = new String[s.length()];
        String res = "";
        for (int i = 0; i < indices.length; i++) {
            resArr[indices[i]] = String.valueOf(s.charAt(i));
        }
        for (int i = 0; i < resArr.length; i++) {
            res += resArr[i];
        }
        return res;
    }
}