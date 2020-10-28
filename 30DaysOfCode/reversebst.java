import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
      //Write your code here
      
    static void levelOrder(Node root){
    Queue<Node> queue = new LinkedList();
    queue.add(root);
    
    while(!queue.isEmpty()){
        Node current = queue.remove();
        System.out.print(current.data+" ");
        if (current.left!=null) queue.add(current.left);
        if (current.right!=null) queue.add(current.right);
    }

    }

public static Node insert(Node root,int data){