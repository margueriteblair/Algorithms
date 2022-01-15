import java.util.Arrays;
import java.util.List;

public class Knapsack {
    static int Knapsack (int numitems, int capacity, List<Integer> weight, List<Integer> value) {

        // No item can be put in the sack of capacity 0 so maximum value for sack of capcacity 0 is 0
        if (capacity == 0)
           return 0;

        // If 0 items are put in the sack, then maximum value for sack is 0
        //hi
        if (numitems == 0)
           return 0;

        /* Note : Here the number of item is limited (unlike coin change / integer partition problem) 
           hence the numitems -> (numitems - 1) when the item is included in the knapsack */
        if (capacity >= weight.get(numitems-1))
           return Math.max (Knapsack (numitems-1, capacity, weight, value), // Item not included in the sack.
                       Knapsack (numitems-1, capacity-weight.get(numitems-1), weight, value) + value.get(numitems-1)); // Item included.
        else
           return Knapsack(numitems-1, capacity, weight, value);
    }

    // Dynamic programming approach to 0-1 Knapsack problem
    static int DPKnapsack (int capacity, List<Integer> weight, List<Integer> value) {

        int numitems = weight.size();
        int maxval[][] = new int[numitems+1][capacity+1];

        // If 0 items are put in the sack of capacity 'cap' then maximum value for each sack is 0
        for (int cap=0; cap<=capacity; cap++)
            maxval[0][cap] = 0;

        // No item can be put in the sack of capacity 0 so maximum value for sack of capcacity 0 is 0
        for (int item=0; item<=numitems; item++)
            maxval[item][0] = 0;

        for (int item=1; item <= numitems; item++) {
            for (int cap=1; cap <= capacity; cap++) {

                /* Note : Here the number of item is limited (unlike coin change / integer partition problem) 
                   hence the numitems -> (numitems - 1) when the item is included in the knapsack */
                if (cap >= weight.get(item-1)) {
                    maxval[item][cap] = Math.max (maxval[item-1][cap], // Item not included in the sack. 
                                             maxval[item-1][cap-weight.get(item-1)] + value.get(item-1)); // Item included.
                } else {
                    maxval[item][cap] = maxval[item-1][cap];
                }
            }
        }
        return maxval[numitems][capacity];
    }

    public static void main (String args[]) {

        List<Integer> weight = Arrays.asList(1, 3, 4, 6, 9);
        List<Integer> value = Arrays.asList(5, 10, 4, 6, 8);
        int capacity = 10; // Items (1, 3, 9) give maximum value of 21

        System.out.println("Maximum value of 0-1 Knapsack using DP : " + DPKnapsack(capacity, weight, value));
        System.out.println("Maximum value of 0-1 Knapsack using recursion: " + Knapsack(weight.size(), capacity, weight, value));

        List<Integer> weight1 = Arrays.asList(1, 2, 3, 5);
        List<Integer> value1 = Arrays.asList(1, 19, 80, 100);
        capacity = 6; // Item (1,5) gives maximum value of 101 

        System.out.println("Maximum value of 0-1 Knapsack using DP : " + DPKnapsack(capacity, weight1, value1));
        System.out.println("Maximum value of 0-1 Knapsack using recursion: " + Knapsack(weight1.size(), capacity, weight1, value1));

        List<Integer> weight2 = Arrays.asList(3, 5);
        List<Integer> value2 = Arrays.asList(80, 100);
        capacity = 2; // No item can be added to the knapsack.

        System.out.println("Maximum value of 0-1 Knapsack using DP : " + DPKnapsack(capacity, weight2, value2));
        System.out.println("Maximum value of 0-1 Knapsack using recursion: " + Knapsack(weight2.size(), capacity, weight2, value2));

        List<Integer> weight3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> value3 = Arrays.asList(3, 5, 4, 8, 10);
        capacity = 5; // Items with weight (1, 4) give maximum value of 11.

        System.out.println("Maximum value of 0-1 Knapsack using DP : " + DPKnapsack(capacity, weight3, value3));
        System.out.println("Maximum value of 0-1 Knapsack using recursion: " + Knapsack(weight3.size(), capacity, weight3, value3));

    }
}