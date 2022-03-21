import java.util.HashMap;
import java.util.Map;

public class Trie {

    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root; //we initialize the root
    //root is a property of our Trie class
    //then below we initialize a new Trie
    public Trie() {
        root = new TrieNode();
    }

    //this is the iterative implementation
    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if (node == null){
                node = new TrieNode();
                curr.children.put(ch, node);
            }
            curr = node;
        }
        curr.endOfWord = true; //then we mark that we've reached our end of word
    }

    public void insertRecursive(String word) {
        insertRecursive(root, word, 0);
    }

    public void insertRecursive(TrieNode curr, String word, int index) {
        if (index == word.length()) {
            curr.endOfWord = true;
            return;
        }

        char ch = word.charAt(index);
        TrieNode node = curr.children.get(ch);
        if (node == null) {
            node = new TrieNode();
            curr.children.put(ch, node);
        }

        insertRecursive(node, word, index+1);
    }

    public boolean search(String word){
        //will return true or false if a string is in a word
        TrieNode curr = root;
        for (int i= 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if (node == null) {
                return false;
            }
            curr = node;
        }
        return curr.endOfWord; //will return true if we've reached the end of the word
    }

    //and now, for the recursive implementation
}