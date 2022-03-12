package CrackingTheCodingInterview.TechnicalQuestions;

public class Heaps {
    public static void main(String[] args) {
        
    }

    /*
    -Heaps and priority queues
    -Heaps resemble a complete binary tree
    -Every single level is full except for the last one
    -Nodes need to be pushed to the left
    -There's two variations on the heap - the min heap & the max heap
    -The max heap has the idea that at each node, each child node value is smaller
    -Every single child is smaller
    -Root node is the greatest value
    -Min heap is the reverse of the rule, it's the smallest value at the root

    -We can use breadth first search to find the order of the max heap
    -Formula to get the node's parent:
        - parent: floor((index-1)/2)
        - left: (index x 2) + 1
        - right (index x 2) + 2
    - The array is the literal code implementation of the data structure
    - Insert the new node into the end, then shift it backwards until it's in the appropriate location
    */
}