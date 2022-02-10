int solution(Tree<Integer> root) {
    int count = 1;
    if (root == null || (root.left == null && root.right == null)) {
        return 0;
    }

    if (root.left != null) {
        count += solution(root.left);
    }
    if (root.right != null) {
        count += solution(root.right);
    }
    return count;
}