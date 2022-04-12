import java.util.*;

public class BiggerIsGreater {
    public static void main(String[] args) {
        
    }

    static String biggerIsGreater(String s) 
    {
        char charArr[] = s.toCharArray();
        int n = charArr.length;
        int i = 0;
        for (i = n - 1; i > 0; i--)
        {
            if (charArr[i] > charArr[i - 1]) 
            {
                break;
            }
        }
        if (i == 0) 
        {
            return "no answer";
        } 
        else 
        {
            int small = charArr[i - 1], next = i;

            for (int j = i + 1; j < n; j++) 
            {
                if (charArr[j] > small && charArr[j] < charArr[next])
                {
                    next = j;
                }
            }
            swap(charArr, i - 1, next);
            Arrays.sort(charArr, i , n);
        }
        return new String(charArr);
    }
    static void swap(char charArr[], int i, int j)
    {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }
    
    private static void permutation(String prefix, String str, List list) {
    int n = str.length();
    if (n == 0) list.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), list);
    }
}