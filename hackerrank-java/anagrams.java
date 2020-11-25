import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int len = s.length(); 
        int ans = 0;
        //counter map for substring
        HashMap<String,Integer> subMap= new HashMap<String,Integer>();
        //iterate through all the possible substring of s
        for(int i = 1;i<len;i++){//starting with size 1,2,3,4
            for(int j= 0;i+j<len+1; j++){
                String sub = s.substring(j,i+j);
                //before putting the substring into the map, sort the string
                //in this way abc, acb will result in abc abc pair
                char[] subArray = sub.toCharArray();
                Arrays.sort(subArray);
                String subSorted = new String(subArray);
                Integer subNumber = subMap.get(subSorted);
                if(subNumber==null )//check if the sequnece already exists
                    subMap.put(subSorted,1);//put in for the first time
                else{
                    subNumber++;//sub already inserted so update plus 1
                    subMap.put(subSorted,subNumber);
                    //if we have values o n for a sub 
                    //increse ans with n*(n-1)/2 but removing the value of the preceding
                    //iteratrion -= (n-1)*(n-2)/2
                    ans -= ((subNumber-1)*(subNumber-2))/2;
                    System.out.println("ans first "+ans);
                    ans += (subNumber*(subNumber-1))/2;
                    System.out.println("ans second "+ ans);
                }

            }
        }
        return ans;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
