public static void levelOrder(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        Node removed = queue.remove();
        System.out.print(removed.data + " ");
        if (removed.left != null) queue.add(removed.left);
        if (removed.right != null) queue.add(removed.right);
    }
  
  
}