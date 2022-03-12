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

    peek() {
        return this._heap[0]
    }

    push(val) {
        this._heap.push(val);
        //then siftUp
    }

    pop() {
        return this._heap.shift();
    }
}