class DoublyLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
    }

    setHeadTo(node) {
        if (this.head === node) {
            return null;
        } else if (this.head === null) {
            this.head = node;
            this.tail = node;
        } else if (this.head === this.tail) {
            this.tail.prev  = node;
            this.head = node;
            this.tail.next = this.tail;
        } else{
            if (this.tail === node) {
                node.removeBindings();
                this.head.prev = node;
                node.next = this.head;
                this.head = node;
            }
        }
    }
    removeTail() {
        if (this.tail === null) {
            return;
        } 
        if (this.tail === this.head) {
            this.head = null;
            this.tail = null;
            return;
        }
        this.tail = this.tail.prev;
        this.tail.next = null;
    }
}

class DoublyLinkedListNode {
    constructor(key, value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    removeBindings() {
        if (this.prev !== null) {
            this.prev.next = this.next;
        }
        if (this.next !== null) {
            this.next.prev = this.prev;
        }

        this.prev = null;
        this.next = null;
    }
}