// Do not edit the class below except for the insertKeyValuePair,
// getValueFromKey, and getMostRecentKey methods. Feel free
// to add new properties and methods to the class.
//def add hashtable for constant lookup
//hashtable that maps to nodes in a doubly linked list
//making new node the head is O(1)
class LRUCache {
    constructor(capacity) {
      this.capacity = capacity;
      this.cache = new Map();
      this.currentSize = 0;
      this.listOfMostRecent = new DoublyLinkedList();
  }

  insertKeyValuePair(key, value) {
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
      this.updateMostRecent(this.cache.get(key)); //this is a doubly linked list node
  }

  getValueFromKey(key) {
      if (!this.cache.has(key)) {
          return null;
      }
      this.updateMostRecent(this.cache.get(key));
      return this.cache.get(key).value;
  }

  getMostRecentKey() {
      if (!this.listOfMostRecent.head) return;
              console.log(this.listOfMostRecent.head);
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
          this.tail.prev = node;
          this.head = node;
          this.tail.next = this.tail;
      } else{
          if (this.tail === node) {
              this.removeTail(); //remove the tail from this doubly linked list
          }
                      node.removeBindings();
                    this.head.prev = node;
          node.next = this.head;
          this.head = node;
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

// Do not edit the line below.
exports.LRUCache = LRUCache;