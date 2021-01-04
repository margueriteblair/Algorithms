public class Encryption {
    static String encryption(String s) {
        char[] arrArr = s.toCharArray();
        int n = arrArr.length;
        int gap= (int) Math.sqrt(n);
        if (gap*gap!=n){
            gap++;
        }
        String encoded = "";
        for(int i=0;i<gap;i++){
            for(int j=i;j<n;j+=gap){
                encoded+=arrArr[j];
            }
            encoded+=" ";
        }
        return encoded;
    }
    public static void main(String[] args) {
        
    }
}