class GNode {
    constructor(value = 0, children = []) {
      this.children = children
      this.value = value
    }
    
    hasPathTo(node) {
        // Write your code here.
        if (!node) return false;
        let q = [this];
        let seen = new Map();
        while (q.length) {
          let curr = q.shift();
          console.log(curr.value, node.value);
          seen.set(curr, true);
          if (curr.value == node.value) return true;
          for (let i = 0; i < curr.children.length; i++) {
            let connection = curr.children[i];
            if (!seen.get(connection)) {
              q.push(curr.children[i]);
            }
          }
        }
        return false;
    }
  }
  
  var node2 = new GNode(2)
  var node1 = new GNode(1, [node2, new GNode(3)])
  var node4 = new GNode(4, [node1])
  var node5 = new GNode(5, [node1, node4])
  var node6 = new GNode(6)
  var node7 = new GNode(1)
  var node8 = new GNode(2)
  var node9 = new GNode(3)
  node7.children = [node8]
  node8.children = [node9]
  node9.children = [node7]
  
  console.log(node5.hasPathTo(node2), "expects true")
  console.log(node6.hasPathTo(node1), "expects false")
  console.log(node1.hasPathTo(node4), "expects false")