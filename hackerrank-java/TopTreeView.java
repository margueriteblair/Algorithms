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