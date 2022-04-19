package CrackingTheCodingInterview.Udemy;

import java.util.List;

public interface Monarchy {
    void birth(String child, String parent);
    void death(String name);
    List<String> getOrderOfSuccession();
}

// Monarchy mon = new Monarchy('Jake')
//birth('Catherine', 'Jake')
//birth('Tom', 'Jake')
//birth('Celine', 'Jake') --> birth orders
//birth('Mark', 'Catherine')
//the order of succession is Jake -> Catherine -> Farah -> Mark
//order of succession can be changed by a death in the family
//data structure to retain a tree
//use any features in your language
//N-ary tree, can use DFS & BFS