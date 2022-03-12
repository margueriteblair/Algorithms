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

    _swap(i, j) {
        let tmp = this._heap[i]
        this._heap[i] = this._heap[j]
        this._heap[j] = tmp;
    }

    //we also need to be able to compare two values inside of our heap
    _compare(i, j) {
        return this._comparator(this._heap[i], this._heap[j]); //our comparator method takes in two values to compare, here we're explicitly giving it two values in our heap to compare
    }

    //we need to define helper methods to achieve this
    push(val) { //this will push values into the heap while maintaining the strucutre, so then we have to sift up
        this._heap.push(val);
        //then siftUp
        this._siftUp();
        return this.size;
    }

    _siftUp(){
        let nodeIdx = this.size()-1;

        while (0 < nodeIdx && this._compare(nodeIdx, this._parent(nodeIdx))) {
            this._swap(nodeIdx, this._parent(nodeIdx));
        }
        nodeIdx = this._parent(nodeIdx); //we're moving our node upwards through our heap
    }

    pop() { //remove the node from the root. insertion and deletion methods
        return this._heap.shift();
    }
}