class TrieNode{
    //Map<Character,TrieNode> childrens = new HashMap<>();
    Map<Character, TrieNode> children;
    boolean isWord;
    
    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                curr.children.put(ch, node);
            }
            curr = node;
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if (node == null) {
                return false;
            }
            curr = node;
        }
        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int i = 0; i < prefix.length(); i++){
            curr = curr.children.get(prefix.charAt(i));
            if(curr == null){
                return false;
            }
        }
        return true;
    }
}