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

public Node lowestCommonAncestor2(Node p, Node q) {
    Node p1 = p;
    Node p2 = q;
    while (p1 != p2) {
        if (p1.parent != null) {
            p1 = p1.parent;
        } else {
            p1 = q;
        }
        
        if (p2.parent != null) {
            p2 = p2.parent;
        } else {
            p2 = p;
        }
    }
    return p1;
}