class TrieNode {
    constructor() {
        this.endsWith = false;
        this.keys = new Map();
    }
}

class Trie {
    constructor() {
        this.root = new TrieNode();
    }

    //method to insert a word into a Trie
    insert(word, node = this.root) {
        if (word.length === 0) {
            node.end = true;
            return;
        } else if (!node.keys.get(word[0])) {
            //if the current char doesn't already exist, then we say to add the new char to the hashmap of keys of our current node
            node.keys.get(word[0]) = new TrieNode();
            this.insert(word.substring(1), node.keys.get(word[0]))
        } else {
            this.insert(word.substring(1), node.keys.get(word[0]));
        }
    }
}