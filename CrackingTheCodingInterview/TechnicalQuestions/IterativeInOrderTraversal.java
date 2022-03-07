package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.Stack;

public class IterativeInOrderTraversal {
    public static void main(String[] args) {
        
    }

    //push non null node values to the stack, pop when the value is null
    public static void iterativeInOrder(Node root) {
        if (root == null) return; //if the root is null theres nothing to print
        Stack<Node> stack = new Stack<>(); //initialize a stack that takes in nodes, so we can refer to the pointers
        while (true) { //while true
            if (root != null) { //if the root is not null, we push the root on to the stack, and then set the root = to left node
                stack.push(root);
                root = root.left;
            } else { //otherwise, if the stack is empty, break out
                if (stack.isEmpty()) break; //exit the loop if the stack is empty
                root = stack.pop(); //pop the root value off of the stack, because this is our node (remember, L->N->R)
                System.out.println(root.value); //print out the root val
                root = root.right; //then set it equal to right
            }
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int val, Node left, Node right) {
        this.value = val;
        this.left = left;
        this.right = right;
    }
}