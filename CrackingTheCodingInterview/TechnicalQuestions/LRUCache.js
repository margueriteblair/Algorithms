class LRUCache {
    constructor(capacity) {
        this.capacity = capacity;
        this.cache = new Map();
        this.currentSize = 0;
        this.listOfMostRecent = new DoublyLinkedList();
    }

    set(key, value) {
        if (!this.cache.has(key)) {
            //if the cache 
            if (this.currentSize === this.capacity) {
                this.evictLeastRecent();
            } else {
                this.currentSize++;
            }
            this.cache.set(key, new DoublyLinkedListNode(key, value));
        } else {
            this.replaceKey(key, value);
        }
        this.updateMostRecent(this.cache.get(key));
    }

    get(key) {
        if (!this.cache.has(key)) {
            return null;
        }
        this.updateMostRecent(this.cache.get(key));
        return this.cache.get(key).value;
    }

    getMostRecentKey() {
        if (!this.listOfMostRecent.head) return;
        return this.listOfMostRecent.head.key; //this is a doubly linked list node;
    }

    evictLeastRecent() {
        const keyToRemove = this.listOfMostRecent.tail.key;
        this.listOfMostRecent.removeTail(); //the tail is the least recent
        this.cache.delete(keyToRemove);
    }

    updateMostRecent(node) {
        this.listOfMostRecent.setHeadTo(node);
    }

    replaceKey(key, value) {
        if (this.cache.has(key)) {
            this.cache.get(key).value = value
        }
    }
}