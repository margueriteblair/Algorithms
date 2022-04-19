class Monarchy {
    //n-ary tree
    //represent the children as an array
    //children: [Jane, Farah]...
    //DFS, preorder 
    //instantiate an internal hashmap
    constructor(king) {
        this.king = new Person(king);
        this.personMap = new Map();
        this.personMap.set(this.king.name, this.king);
    }

    birth = function(child, parent) { //both child and parent are of people classes
        let childPerson = new Person(child);
        this.personMap.set(parent, this.personMap.get(parent).push(childPerson))
        this.personMap.set(child, this.child)
    }

    death = function(name) {

    }

    getOrderOfSuccession = function() {
        //traverse Tree here
    }
}

class Person {
    constructor(name) {
        this.name = name;
        this.isAlive = true; //we'll just add a boolean and switch it to False
        this.children = [];
    }
}