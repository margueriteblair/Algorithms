public Node lowestCommonAncestor(Node p, Node q) {
    Stack<Node> stackP = new Stack<>();
    Stack<Node> stackQ = new Stack<>();
    
    while (p != null) {
        stackP.push(p);
        p = p.parent;
    }
    
    while (q != null) {
        stackQ.push(q);
        q = q.parent;
    }
    
    Node lca = null;
    while (stackQ.size() > 0 && stackP.size() > 0) {
        p = stackP.pop();
        q = stackQ.pop();
        if (p == q) {
            lca = p;
        }
    }
    return lca;
}