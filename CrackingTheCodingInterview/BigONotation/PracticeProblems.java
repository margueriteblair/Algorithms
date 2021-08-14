public class PracticeProblems {
    public static void main(String[] args) {
        System.out.println(powersOf2(50));
    }

    public void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
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

    // int sum(Node node) {
    //     if (node == null) {
    //         return 0;
    //     }

    //     return node.value + sum(node.left) + sum(node.right);
    //     //just bc this is a bst doesn't mean theres a log - it touches every node, so the runtme will be O(n)
    // }

    boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n / x == 0) {
                return false;
            }
        }
        return true;
    }

    int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    //O(N) time bc itll need to hypothetically touch all points


    void allFib2(int n) {
        int[] memo = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i, memo));
        }
    }

    int fib(int n, int[] memo) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] >  0) {
            return memo[n];
        }
        memo[n] = fib(n-1, memo) + fib(n-2, memo);
        return memo[n];
    }

    //this one above uses memoization to have an O(N) solution. Because we store the previous two terms in an array, we just sum them and that is constant
    //we do this constant summation N times for an O(N) solution

    public static int powersOf2(int n) {
        if (n == 1) {
            return 1;
        } else {
            int prev = powersOf2(n/2);
            int curr = prev*2;
            return curr;
        }
    }
    //we divide in half every time so O(log N)

    int mod(int a, int b) {
        if (b <= 0) {
            return -1;
        }

        int div = a / b;
        return a - div * b;
    }
    //(O(1))

    int div(int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++
        }
        return count;
    }
    //O(a/b)

    int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
        //O(log N)
    }

    int[] copyArray(int[] array) {
        int[] copy = new int[0];
        for (int value : array) {
            copy = appendToNew(copy, value);
        }
        return copy;
    }

    int[] appendToNew(int[] array, int value) {
        int[] bigger = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }

        bigger[bigger.length-1] = value;
        returb bigger;
    }

    //copyArray w/ appendToNew O(N^2) solution for making a copy an array

    int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
        //big O runtime is O(log N)
    }
}