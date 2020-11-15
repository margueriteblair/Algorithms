import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static List<String> permList = new ArrayList<>();

    // Complete the solve function below.
    static String solve(String n) {
        generatePermutation(n, 0, n.length());
        System.out.println(permList);
        if (permList.size() > 0) {
            permList.clear();
            return "YES";
        }
        return "NO";
}
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    } 
    
    public static void generatePermutation(String str, int start, int end) {  
        //Prints the permutations  
        if (start == end-1 && Integer.parseInt(str) % 8 == 0) {
            permList.add(str); 
        } else {  
            for (int i = start; i < end; i++) {  
                str = swapString(str,start,i);  
                generatePermutation(str,start+1,end);  
                str = swapString(str,start,i);  
            } 
 
        }  
    }  


 
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String n = scanner.nextLine();

            String result = solve(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

