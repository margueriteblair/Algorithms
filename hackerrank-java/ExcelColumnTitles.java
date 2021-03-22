public class ExcelColumnTitles {
    public static void main(String[] args) {
        
    }

    public String convertToTitle(int columnNumber) {
        String str = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        String[] arr = str.split("");
        
        if (columnNumber <= 26) {
            return arr[columnNumber-1];
        } else {
            
        }
    }
}