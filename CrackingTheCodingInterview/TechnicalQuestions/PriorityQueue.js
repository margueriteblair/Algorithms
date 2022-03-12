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

    push(val) { //this will push values into the heap while maintaining the strucutre, so then we have to sift up
        this._heap.push(val);
        //then siftUp
    }

    pop() { //remove the node from the root
        return this._heap.shift();
    }
}