import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            return new int[] {1, 2, 3, 4};
        }

        public static int get_expected_result() {
            int lowestNum = TestDataUniqueValues.get_array()[0];
            int lowestInd = 0;
            for (int i = 0; i < TestDataUniqueValues.get_array().length; i++) {
                if (lowestNum > TestDataUniqueValues.get_array()[i]) {
                    lowestNum = TestDataUniqueValues.get_array()[i];
                    lowestInd = i;
                }
            }
            return lowestInd;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[] {1, 1, 4, 2, 7};
        }

        public static int get_expected_result() {
            int lowestNum = TestDataExactlyTwoDifferentMinimums.get_array()[0];
            int lowestInd = 0;
            for (int i = 0; i < TestDataExactlyTwoDifferentMinimums.get_array().length; i++) {
                if (lowestNum > TestDataExactlyTwoDifferentMinimums.get_array()[i]) {
                    lowestNum = TestDataExactlyTwoDifferentMinimums.get_array()[i];
                    lowestInd = i;
                }
            }
            return lowestInd;
        }
    }

    