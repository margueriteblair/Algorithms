public class SortSentence {
    public static void main(String[] args) {
        
    }

    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] sArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sArr[Integer.valueOf(arr[i][arr[i].length()-1])] = arr[i].substring(0, arr[i].length()-1);
        }
        
        System.out.println(Arrays.toString(sArr));
        return "";
    }
}