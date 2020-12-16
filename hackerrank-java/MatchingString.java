    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] counts = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int temp = 0;
            for (int j = 0; j < strings.length; j++) {
                if (queries[i].equals(strings[j])) temp++;   
            }
            counts[i] = temp;
        }
        return counts;

    }