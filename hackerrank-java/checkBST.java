
public class checkBST {
    boolean checkBST(Node root) {
        return checkerFunction(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }

    boolean checkerFunction(Node node, int min, int max) {
        if (node == null) return true;
        if (node.data < min || node.data >= max) {
            return false;
        }
        return checkerFunction(node.left, min, node.data) && checkerFunction(node.right, node.data, max);
    }

    
}