public class PracticeProblems {
    public static void main(String[] args) {
        
    }

    public void printUnorderedPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }
    //it's the sum of 1 through n-1; the sum of 1 -> n-1 is (n(n-1))/2
    //this one has a runtime of O(n^2)

    public void printUnorderedPairs2(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[i]) {
                    //this if statement is constant time
                    System.out.println(arrayA[i] + " " + arrayB[i]);
                }
            }
        }
    }
    //this is O(nm) we've got two inputs of potentially varying size
}