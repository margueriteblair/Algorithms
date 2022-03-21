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
    public boolean searchRecursive(String word) {
        return searchRecursive(root, word, 0)
    }

    private boolean searchRecursive(TrieNode curr, String word, int index) {
        if (index == word.length()) {
            //if our index is up to our length, we've reached the end of the word
            return curr.endOfWord;
        }

        char ch = word.charAt(index);
        TrieNode node = curr.children.get(ch);
        if (node == null) {
            return false;
        }
        return searchRecursive(node, word, index+1);
    }

    public void delete(String word) {
        //deleting an entire word from a trie
        delete(root, word, 0);
    }

    private boolean delete(TrieNode curr, String word, int index) {
        if (index == word.length()) {
            //we will only delete if the current node is the end of the word
            if (!curr.endOfWord) {
                return false;
            }

            curr.endOfWord = false;

            return curr.children.size() == 0; //this will return true or false;
        }
        char ch = word.charAt(index);
        TrieNode node = curr.children.get(ch);
        if (node == null) {
            return false;
        }

        boolean shouldDeleteCurrNode = delete(node, word, index+1);
        
        if (shouldDeleteCurrNode) {
            curr.children.remove(ch);
            return curr.children.size() == 0;
        }
        return false;
    }

}