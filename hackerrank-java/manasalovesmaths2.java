import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.math.BigInteger; 
    


public class manasalovesmaths2 {
    static List<String> permList = new ArrayList<>();
    static BigInteger eight = new BigInteger("8");

    public static void main(String[] args) {
        System.out.println(solve("78")); //this is correct
        // var A = new BigInteger("344447401973121441077768855432158702762861375430");
        // System.out.println(A.remainder(new BigInteger("8")));
        // A.remainder(8);
        System.out.println(solve("344447401973121441077768855432158702762861375430"));
        // System.out.println(solve("684235100752110815577359844276924659182357568871521286361018621208416841520627779"));

    }

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
    if (start == end-1 && new BigInteger(str).remainder(eight) == BigInteger.ZERO) {
        permList.add(str); 
    } else {  
        for (int i = start; i < end; i++) {  
            str = swapString(str,start,i);  
            generatePermutation(str,start+1,end);  
            str = swapString(str,start,i);  
        } 

    }  
}
}