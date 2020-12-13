public static Node insert(Node root,int data) {
    if (root == null) {
        Node newNode = new Node(data);
        newNode.left = null;
        newNode.right = null;
        root = newNode;
    }
    if (data > root.data) {
        root.right = insert(root.right, data);
    }
    if (data < root.data) {
        root.left = insert(root.left, data);
    }
    return root;

}