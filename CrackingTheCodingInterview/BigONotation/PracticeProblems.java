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

    void printUnorderedPairs3(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                for (int k = 0; k < 10000; k++) {
                    System.out.println(arrayA[i] + ", " + arrayB[j]);
                }
            }
        }
    }
    //still O(nm) because the 10000 is constant
    //test

    //the following code reverses an array, what is the runtime:
    void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i -1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }
    //this is still O(n) runtime even though it only goes through half the array
}