public class BiggerIsGreater {
    static String biggerIsGreater(String w) {
        List<String> list = new ArrayList<>();
        permutation("", w, list);
        System.out.println(list);
        String largest = w;
        String secondLargest = w;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(w) > 0 && list.get(i).compareTo(secondLargest) > 0) {
                largest = list.get(i);
            }
            if (largest.compareTo(list.get(i)) > 0 && secondLargest.compareTo(w) > 0) {
                secondLargest = list.get(i);
            }
        }
        return largest.equals(w) ? "no answer" : secondLargest;
        // return "no answer";
    }
    
    private static void permutation(String prefix, String str, List list) {
    int n = str.length();
    if (n == 0) list.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), list);
    }
}

    static String biggerIsGreater2(String s) 
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
    static void swap2(char charArr[], int i, int j)
    {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }
}
