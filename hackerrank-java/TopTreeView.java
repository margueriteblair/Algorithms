public class TopTreeView {
    public static void main(String[] args) {
        
    }
    public static void topView(Node root) {
        //this problem is typically solved with a stack to print the left subtree
        //and a queue to print the right subtree
            Stack<Node> stack = new Stack<>();
            Node copyNode = root.right;      
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop().data + " ");
            }
            // System.out.println(copyNode.data);
            while (copyNode != null) {
                System.out.print(copyNode.data + " ");
                copyNode = copyNode.right;
            }
    
        }
}

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    static class QueueNode{
        Node node;
        int level;
        public QueueNode(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
        Queue<QueueNode> queue = new LinkedList<QueueNode>();
       
        //Taking a TreeMap<first, second>
        //first - stores the level of the node
        //second - stores the node.data
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
    //why TreeMap? Because I want the nodes to be sorted from leftmost to rightmost
        
        //start (since root, level = 0)
        queue.add(new QueueNode(root, 0));
        
        while(!queue.isEmpty()){
            //remove element from queue
            QueueNode r = queue.poll();
            //if the level of this node has never been reached before -> visible in top view
            if(!map.containsKey(r.level)){
                map.put(r.level, r.node.data);
            }
            
            //add node's descendants
            //all left child node levels = node.level - 1
            //all right child node levels = node.level + 1
            if(r.node.left != null){
                queue.add(new QueueNode(r.node.left, r.level - 1));
            }
            if(r.node.right != null){
                queue.add(new QueueNode(r.node.right, r.level + 1));
            }
        }
        //since already sorted (cuz TreeMap), print from left to right
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
    }

	public static Node insert(Node root, int data) {