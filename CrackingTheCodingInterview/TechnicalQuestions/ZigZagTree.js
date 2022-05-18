function solution(array) {
    if (array.length == 0) return null;
    
    let root = new Tree(array[0]);
    let copy = root;
    let isRight = true;
    for (let i = 1; i < array.length; i++) {
        if (isRight) {
            root.right = new Tree(array[i])
            root = root.right;
        } else {
            root.left = new Tree(array[i]);
            root = root.left;
        }
        isRight = !isRight; 
    }
    return copy;
}