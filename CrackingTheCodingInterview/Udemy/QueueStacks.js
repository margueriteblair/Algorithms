class QueueWithStacks {
    constructor () {
        this.in = [];
        this.out = [];
    }

    enqueue (val) { // O(1)
        this.in.push(val);
    }

    dequeue() { // O(N)
        if (this.out.length === 0) {
            while (this.in.length) {
                this.out.push(this.in.pop());
            }
        }
        return this.out.pop();
    }

    peek () { //O(N)
        if (this.out.length === 0) {
            while (this.in.length) {
                this.out.push(this.in.pop());
            }
        }
        return this.out.peek();
    }

    empty() { //O(1)
        return this.out.length === 0 && this.in.length === 0;
    }
    //hi
}