public class TruncateStr {
    public String truncateSentence(String s, int k) {
        String res = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < k; i++) {
            res += arr[i] + " ";
        }
        
        return res.substring(0, res.length()-1);
    }
}