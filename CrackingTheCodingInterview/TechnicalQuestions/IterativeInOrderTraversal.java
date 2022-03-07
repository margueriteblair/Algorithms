package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.Stack;

public class IterativeInOrderTraversal {
    public static void main(String[] args) {
        
    }

    //push non null node values to the stack, pop when the value is null
    public static void iterativeInOrder(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        while (true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) break; //exit the loop if the stack is empty
                root = stack.pop();
                System.out.println(root.value);
                root = root.right;
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