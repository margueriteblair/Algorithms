package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.*;

public class MoveElementToEnd {
    public static void main(String[] args) {
        
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
            int i = 0;
            int j = array.size()-1;
            while (i < j) {
                while (array.get(j) == toMove && i < j) j--;
                while (array.get(i) != toMove && i < j) i++;
                int tmp = array.get(j);
                array.set(j, array.get(i));
                array.set(i, tmp);
            }
        return array;
      }
}