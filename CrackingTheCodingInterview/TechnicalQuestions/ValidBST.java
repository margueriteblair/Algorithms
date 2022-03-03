package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {
    public static void main(String[] args) {
        
    }

    public boolean isValidBST(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        inOrderTraversal(root, list);
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i) >= list.get(i+1))return false;
        }
        return true;
        
    }
    
    public void inOrderTraversal(TreeNode node, List<Integer> arr) {
        if (node != null) {
            inOrderTraversal(node.left, arr);
            arr.add(node.val);
            inOrderTraversal(node.right,arr);
        }
    }

    public boolean isValidBST2(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean isValid(TreeNode root, long min,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
            
        return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
            
    }

    public boolean isValidBST3(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        dfs(root, arr);
        System.out.println(arr);
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i+1) <= arr.get(i)) return false;
        }
        return true;
    }
    
    public List<Integer> dfs(TreeNode node, List<Integer> arr) {
        if (node != null) {
            dfs(node.left, arr);
            arr.add(node.val);
            dfs(node.right, arr);
        }
        return arr;
    }
}