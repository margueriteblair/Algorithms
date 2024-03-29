// Do not edit the class below except
// for the breadthFirstSearch method.
// Feel free to add new properties
// and methods to the class.
class Node {
    constructor(name) {
      this.name = name;
      this.children = [];
    }
  
    addChild(name) {
      this.children.push(new Node(name));
      return this;
    }
  
    breadthFirstSearch(array) {
      let q = [this];
          while (q.length) {
              let curr = q.shift();
              array.push(curr.name);
              for (const child of curr.children) {
                  q.push(child);
              }
          }
          return array;
    }
  }