class PriorityQueue {
    constructor(comparator = (a, b) =>  a > b ) {
        //if a > b, max heap, otherwise min heap
        this._heap = [] //the underscore in javascript denotes that it's a private method
        this._comparator = comparator; //after initialization we don't want anyone to change it
    }
    //our methods we want are: size, .isEmpty, .peek, .push, .pop

    size() {
        return this._heap.length;
    }

    isEmpty() {
        return this.size === 0;
    }

    peek() { //peek() should return the root value of the heap. In a max heap should give the biggest val, min heap = smallest
        return this._heap[0]
    }
    // - parent: floor((index-1)/2)
    // - left: (index x 2) + 1
    // - right (index x 2) + 2
    _parent(index) {
        return (Math.floor((index-1)/2))
    }

    _leftChild(index) {
        return (index * 2)+1; //this is to get the left child index of a given node
    }

    _rightChild(index) {
        return (index*2)+2 //to get the right child of a node
    }

    //we need to define helper methods to achieve this
    push(val) { //this will push values into the heap while maintaining the strucutre, so then we have to sift up
        this._heap.push(val);
        //then siftUp
    }

    pop() { //remove the node from the root
        return this._heap.shift();
    }
}