package CrackingTheCodingInterview.TechnicalQuestions;

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
}