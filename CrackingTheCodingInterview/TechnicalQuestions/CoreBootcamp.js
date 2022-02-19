// find element in binary search tree

class Node {
    constructor(v, l=null,r=null) {
        this.value = v;
        this.left = l;
        this.right = r;
    }
}


//boolean return, is it there or not
function find(root, target) {
    if (!root) {
        return false;
    }

    if (root.value === target) {
        return true;
    }

    if (target < root.value) {
        return find(root.left, target);
    }

    return find(root.right, target);
}

//insert target into binary search tree
function insert(root, elem) {
    if (!root) {
        return new Node(elem);
    }
    //do something to go left
    if (root.value < target) {
        if (!root.right) {
            root.right = new Node(target);
        } else {
            insert(root.right, target);
        }
    }
    //do something to go right
    if (root.value > target) {
        if (!root.left) {
            root.left = new Node(target);
        } else {
            insert(root.left, target);
        }
    }
    
}

