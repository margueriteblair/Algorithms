package CrackingTheCodingInterview.Udemy;
//given a binary tree, a target, and a replacement, replace all nodes with the
//target value with the replacement val
public class FindReplacementsBST {
    public static void main(String[] args) {
        
    }

    Tree<Integer> solution(Tree<Integer> root, int target, int replacement) {
        if (root == null) {
            return root;
        }
        if (root.value == target) {
            root.value = replacement;
        } 
        if (root.left != null) {
            solution(root.left, target, replacement);
        }
        
        if (root.right != null) {
            solution(root.right, target, replacement);
        }
        return root;
    }
}