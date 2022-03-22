var TrieNode = function() {
    this.children = new Map();
    this.endOfWord = false;
}

//this is the constructor
var Trie = function() {
    this.root = new TrieNode();
};

/** 
 * @param {string} word
 * @return {void}
 */
Trie.prototype.insert = function(word) {
    let curr = this.root;
    for (let i = 0; i < word.length; i++) {
        let ch = word[i]
        let node = curr.children.get(ch);
        if (!node) {
            node = new TrieNode();
            curr.children.set(ch, node);
        }
        curr = node;
    }
    curr.endOfWord = true;
};

/** 
 * @param {string} word
 * @return {boolean}
 */
Trie.prototype.search = function(word) {
    let curr = this.root;
    for (let i = 0; i < word.length; i++) {
        let ch = word[i];
        let node = curr.children.get(ch);
        if (!node) {
            return false;
        }
        curr = node;
    }
    return curr.endOfWord;
};

/** 
 * @param {string} prefix
 * @return {boolean}
 */
Trie.prototype.startsWith = function(prefix) {
    let curr = this.root;
    for (let i = 0; i < prefix.length; i++) {
        let ch = prefix[i];
        curr = curr.children.get(ch);
        if (!curr) {
            return false;
        }
    }
    return true;
};