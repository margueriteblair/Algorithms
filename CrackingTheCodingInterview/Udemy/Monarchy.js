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
        let parentPerson = this.personMap.get(parent);
        this.personMap.set(parent, parentPerson.push(childPerson))
        this.personMap.set(child, childPerson)
    }

    death = function(name) {
        let deadPerson = this.personMap.get(name);
        if (!deadPerson) {
            return null;
        }
        deadPerson.isAlive = false;
    }

    getOrderOfSuccession = function() {
        //traverse Tree here performs our pre order DFS
        const order = [];

        this._dfs(this.king, order);
        return order;
    }

    _dfs = function(currentPerson, order) {
        if (currentPerson.isAlive) {
            order.push(currentPerson.name);
        }
        for (let i = 0; i < currentPerson.children.length; i++) {
            _dfs(currentPerson.children[i], order)
        }
    }
}

class Person {
    constructor(name) {
        this.name = name;
        this.isAlive = true; //we'll just add a boolean and switch it to False
        this.children = [];
    }
}