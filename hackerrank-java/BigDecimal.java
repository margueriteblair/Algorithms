import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //we have our array s[] of type string and we want to change it to be for type big integer
        // for (int i = 0; i < n; i++) {
        //     Integer in = Integer.parseInt(s[i]);
        //     s[i] = in;
        // }
    
        //Write your code here
        //BigInteger bi = BigInteger.valueOf(myInteger.intValue());
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
            BigDecimal bg1 = new BigDecimal(s[i]);
            BigDecimal bg2 = new BigDecimal(s[j]);
            
            int res = bg1.compareTo(bg2);
            
            if (res == -1) {
                String temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            }


        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}