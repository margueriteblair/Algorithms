import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root){
        int h = height(root);
        for (int i = 0; i < h; i++) {
            printLevel(root, i);
        }
      
    }
    
    static int height(Node root) {
        int heightL;
        int heightR;
        if (root == null) return 0;
        else {
            heightL = height(root.left);
            heightR = height(root.right);
            return heightR > heightL ? heightR+1 : heightL+1;
        }
    }
    
    static void printLevel(Node root, int level) {
        if (root == null) return;
        if (level == 1) System.out.print(root.data + " ");
        if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

	public static Node insert(Node root,int data){