package CrackingTheCodingInterview.TechnicalQuestions;

class TrieNode{
    //Map<Character,TrieNode> childrens = new HashMap<>();
    TrieNode[] childrens = new TrieNode[26];
    boolean isWord;
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for(Character c : word.toCharArray()){
            //TrieNode tmp = curr.childrens.get(c);
            TrieNode tmp = curr.childrens[c-'a'];
            if(tmp == null){
                tmp = new TrieNode();
                //curr.childrens.put(c,tmp);
                curr.childrens[c-'a'] = tmp;
            }
               
            curr=tmp;
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(Character c : word.toCharArray()){
            //curr = curr.childrens.get(c);
            curr = curr.childrens[c-'a'];
            if(curr == null){
                return false;
            }
        }
        return curr.isWord == true;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(Character c : prefix.toCharArray()){
            //curr = curr.childrens.get(c);
            curr = curr.childrens[c-'a'];
            if(curr == null){
                return false;
            }
        }
        return true;
    }
}