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