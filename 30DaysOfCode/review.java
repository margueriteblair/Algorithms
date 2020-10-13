import java.io.*;
import java.util.*;

public class Solution {
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    for(int i=0;i<T;i++){
        String word = scan.next();

        for(int j=0;j<word.length();j++){

            if(j%2 ==0){
                System.out.print(word.charAt(j));
            }
        } 
        System.out.print(" ");
        for(int j=0;j<word.length();j++){
            if(j%2==1){
                System.out.print(word.charAt(j));
            }

        }
        System.out.println();
    }

}
}