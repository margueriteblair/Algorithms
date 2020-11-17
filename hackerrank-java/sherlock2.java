import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {
static String isValid(String s) {

    if(s.isEmpty()) return "NO";
    if(s.length() <= 3) return "YES";

    int[] letters = new int[26];
    for(int i = 0; i < s.length(); i++){
        letters[s.charAt(i) - 'a']++;
    }
    Arrays.sort(letters);
    int i=0;
    while(letters[i]==0){
        i++;
    }
    //System.out.println(Arrays.toString(letters));
    int min = letters[i];   //the smallest frequency of some letter
    int max = letters[25]; // the largest frequency of some letter
    String ret = "NO";
    if(min == max) ret = "YES";
    else{
        // remove one letter at higher frequency or the lower frequency 
        if(((max - min == 1) && (max > letters[24])) ||
            (min == 1) && (letters[i+1] == max))
            ret = "YES";
    }
    return ret;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

static String isValid(String s) {

    Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        ArrayList<Integer> lettersCount = new ArrayList<>();
        for (int count : map.values()) {
            lettersCount.add(count);
        }
        Collections.sort(lettersCount);
        
        System.out.println(lettersCount);  
        int minRepeat = lettersCount.get(0);
        int maxRepeat = lettersCount.get(lettersCount.size()-1);
        if (minRepeat == maxRepeat) {
            return "YES";
        } else {
            if ((maxRepeat-minRepeat == 1) && (maxRepeat > lettersCount.get(lettersCount.size()-2))) {
                return "YES";
            } else if ((minRepeat == 1) && (lettersCount.get(1) == maxRepeat)) {
                return "YES";
            }
        }
        return "NO";
}