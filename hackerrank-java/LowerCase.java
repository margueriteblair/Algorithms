public class LowerCase {
    public static void main(String[] args) {
        
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String toLowerCase(String str) {
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        if(c[i]>='A' && c[i]<='Z')
        {
        int num=(int)c[i];
        c[i]=(char)(num+32);
        }
        }
        return String.valueOf(c);
    }
}
