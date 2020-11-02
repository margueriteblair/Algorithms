import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        String actualReturn = scan.nextLine();
        String expectedReturn = scan.nextLine();

        String[] actualDate = actualReturn.split(" ");
        String[] expectedDate = expectedReturn.split(" ");

        for (String date : actualDate) {
            Integer.parseInt(date);
        }
        for (String date : expectedDate) {
            Integer.parseInt(date);
        }

        if (Integer.parseInt(actualDate[2]) - Integer.parseInt(expectedDate[2]) == 0) {
            if (Integer.parseInt(actualDate[1]) - Integer.parseInt(expectedDate[1]) == 0) {
                if (Integer.parseInt(actualDate[0]) - Integer.parseInt(expectedDate[0]) > 0) {
                    System.out.println((Integer.parseInt(actualDate[0]) - Integer.parseInt(expectedDate[0]))*15);
                } else {
                    System.out.println(0);
                }
            } else if (Integer.parseInt(actualDate[1]) - Integer.parseInt(expectedDate[1]) > 0) {
                System.out.println((Integer.parseInt(actualDate[1]) - Integer.parseInt(expectedDate[1])) * 500);
            } else {
                System.out.println(0);
            }
            
        } else if ((Integer.parseInt(actualDate[2]) - Integer.parseInt(expectedDate[2])) > 0) {
            System.out.println(10000);

        } else {
            System.out.println(0);
        }


    }
}