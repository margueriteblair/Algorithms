public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
       List<Integer> list = new ArrayList<>();
       Integer[] intArr = new Integer[arr.size()];
       for (int i = 0; i < arr.size(); i++) {
           if (i - d >= 0) {
            intArr[i-d] = arr.get(i);
           } else {
            intArr[arr.size()+i-d] = arr.get(i);
           }
       }
       return Arrays.asList(intArr);

    }