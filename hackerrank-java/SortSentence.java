public class SortSentence {
    public static void main(String[] args) {
        
    }

    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] sArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sArr[Integer.valueOf(String.valueOf(arr[i].charAt(arr[i].length()-1)))-1] = arr[i].substring(0, arr[i].length()-1);
        }
        
        String res = "";
        for (int i = 0; i < sArr.length; i++) {
            res += sArr[i] + " ";
        }
        return res.substring(0, res.length()-1);
    }
}