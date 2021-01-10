public class BSTHeight {
    public static void main(String[] args) {
        
    }

    public static int height(Node root) {
        int leftHeight = 0;
        int rightHeight = 0;
        
        if (root.left != null) {
            leftHeight = 1 + height(root.left);
        }
        
        if (root.right != null) {
            rightHeight = 1 + height(root.right);
        }
        
        return rightHeight > leftHeight ? rightHeight : leftHeight;
        }
}